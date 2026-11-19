#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <limits.h>

typedef struct Node {
    int data;
    struct Node *next;
} Node;

typedef struct LinkedList {
    Node *head;
} LinkedList;

// Node constructor
Node* construct_node(int data) {
    Node *node = (Node*) malloc(sizeof(Node)); // create a pointer for the new node and allocate memory for it

    if (node == NULL) exit(EXIT_FAILURE); // validates if memory was successfully allocated or not
    
    // field assignment (fields of a Struct pointer are accessed with arrow op ->)
    node->data = data;
    node->next = NULL;

    return node;
}

// LinkedList constructor
LinkedList* construct_list() {
    LinkedList *list = (LinkedList*) malloc(sizeof(LinkedList));

    if (list == NULL) exit(EXIT_FAILURE);

    list->head = NULL;

    return list;
}

// add a new node to the linked list struct
void add(LinkedList *list, int data) {
    Node *new_node = construct_node(data); // uses constructor to create a new node and keeps pointer

    if (list->head == NULL) {
        list->head = new_node; // if the head pointer is null, make it store the new node 
        return;
    }

    Node *current = list->head; // keeps track of the current node to start the iteration

    while (current->next != NULL) {
        current = current->next; // iterates through every non-null node
    }

    current->next = new_node; // the last node, which should be null, now stores the new node
}

// traverse and print every node of the linked list struct
void traverse(const LinkedList *list) {
    Node *current = list->head;

    while (current != NULL) { // iterate through every node and print its data
        printf("{%d} -> ", current->data);
        current = current->next;
    }

    printf("NULL\n");
}

// memory deallocation
void free_list(LinkedList *list) {
    if (list == NULL) return;

    Node *current = list->head;
    Node *next;

    while (current != NULL) { // iterate through every node and free memory allocated for each of them
        next = current->next;
        free(current);
        current = next;
    }

    free(list); // after the nodes, free the space allocated for the linked list
}


int main(int argc, char *argv[]) {
    // checks number of arguments
    if (argc < 2) {
        printf("[ERROR] Invalid number of arguments, should be: %s <num1> <num2> ...\n", argv[0]);
        return EXIT_FAILURE;
    }

    LinkedList *list = construct_list(); // creates linked list with constructor

    for (int i = 1; i < argc; i++) {
        char *end;
        errno = 0; // resetting before arg conversion

        long value = strtol(argv[i], &end, 10); // converts string arg to base-10 long

        // checks whether if the arg was empty or if it isn't a number
        if (argv[i] == end || *end != '\0') {
            printf("[ERROR] Invalid argument '%s' is not a valid integer number\n", argv[i]);
            free_list(list);
            return EXIT_FAILURE;
        }

        // checks whether the number surpasses integer limits
        if ((errno == ERANGE && (value == LONG_MAX || value == LONG_MIN)) || value > INT_MAX || value < INT_MIN) {
            printf("[ERROR] Invalid argument '%s' is out of bonds\n", argv[i]);
            free_list(list);
            return EXIT_FAILURE;
        }

        add(list, (int) value);
    }

    traverse(list);
    free_list(list);
    return EXIT_SUCCESS;
}

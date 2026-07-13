public class LinkedListStack {
    private Node head = null; // head node of the stack, starts as null

    private class Node { // each node of the stack carries a value and a pointer referencing the next node 
        String val;
        Node next;
    }

    public boolean isEmpty() { // checks if the stack is empty by looking at the head node
        return head == null;
    }

    public void push(String val) {
        Node oldHead = head; // stores the head node in a temp var
        head = new Node(); // init a new node to replace the old head node
        head.val = val; // stores the value to be carried by the new head node
        head.next = oldHead; // now, the next node of the current head will store the old head 
    }

    public String pop() {
        String val = head.val; // stores the value of the head node in a temp var
        head = head.next; // now, the head will point to the next node of the stack, popping the old head
        return val; // returns the value of the popped node
    }
}

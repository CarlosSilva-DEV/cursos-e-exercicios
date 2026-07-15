public class LinkedListQueue {
    private Node front; // first node of the queue, the one which gets dequeued
    private Node rear; // last node of the queue, the one which gets enqueued

    private class Node { // each node of the queue carries a value and a pointer referencing the next node 
        String val;
        Node next;
    }

    public boolean isEmpty() { // checks if the queue is empty by looking at the front node
        return front == null;
    }

    public void enqueue(String val) {
        Node oldRear = rear; // stores the rear node in a temp var
        rear = new Node(); // init a new node to replace the old node
        rear.val = val; // stores the value to be carried by the new rear node
        rear.next = null; // when a node is the rear, it doesn't have a next node, so it should be null

        // handling cases where the queue is empty
        if (isEmpty()) front = rear; // if true, the enqueued new node is the only node in the queue
        else oldRear.next = rear; // if not, the old rear will be the next to last node and the enqueued node is the new rear node
    }

    public String dequeue() {
        String val = front.val; // stores the value of the front node in a temp var
        front = front.next; // now, the front will point to the next node of the queue, dequeueing the old node

        // checks if the queue is now empty after the dequeueing
        if (isEmpty()) rear = null; // if true, there's no node left and the rear should be null 

        return val; // returns the value of the dequeued node
    }
}

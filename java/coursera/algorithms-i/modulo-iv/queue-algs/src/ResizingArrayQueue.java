public class ResizingArrayQueue {
    private String[] q; // stores each String on the queue 
    private int capacity, front, rear; // pointers for tracking the first, last elements and capacity of the queue

    public ResizingArrayQueue() {
        q = new String[1];
        capacity = 0; 
        front = 0; // front pointer starts as the first position of the array
        rear = 0; // rear pointer starts as the first position of the array
    }

    public boolean isEmpty() {
        return capacity == 0;
    }

    public void enqueue(String val) {
        if (capacity == q.length) resize(2 * q.length); // create a new array if the queue is already full
        
        q[rear] = val; // the rear (which should be a null) stores the new String
        rear = (rear + 1) % q.length; // updates the rear circularly so it points to the next empty position 
        capacity++;
    }

    public String dequeue() {
        if (isEmpty()) return null;

        String val = q[front]; // create a temp var to store the dequeued front 
        q[front] = null; // old front position turns null
        
        front = (front + 1) % q.length; // updates the front circularly so it points to the new front of the queue 
        capacity--;

        if (capacity > 0 && capacity == q.length / 4) resize(q.length / 2); // create a new array if the queue is at most 1/4 full

        return val; // returns the dequeued value 
    }
    
    // standard array copying logic
    private void resize(int length) {
        String[] copy = new String[length];

        for (int i = 0; i < capacity; i++) {
            copy[i] = q[(front + i) % q.length]; // copy elements circularly, reordering by least recent enqueueing
        }

        q = copy;
        front = 0; // resetting front pointer to the first position of the array
        rear = capacity; // resetting rear pointer to the next empty position
    }
}

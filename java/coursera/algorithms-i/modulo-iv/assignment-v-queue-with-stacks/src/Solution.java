public class Solution<T> {
    private Stack<T> input, output; // each stack covers only one queue operation (enqueue or dequeue)
    private int size; // keeps track of the size of the queue

    public Solution() {
        input = new Stack<>();
        output = new Stack<>();
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    // uses the input stack for enqueueing
    public void enqueue(T val) {  
        input.push(val); // pushes a T val to the rear of the queue (in this case, the top of the input stack)
        size++; // increments the size of the queue
    }
    
    // uses the output stack for dequeueing, pushing any T element popped from the input to the output in reverse order
    public T dequeue() {  
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop()); // if output stack is empty, push every T element from the input stack to it 
            }
        }

        size--; // decrements the size of the queue
        return output.pop(); // returns the front of the queue (in this case, the top of the output stack because of reversed enqueueing
    }
}

// ResizingArrayStack implementation
class Stack<T> {
    private T[] s; // stores each T on the stack
    private int N = 0; // keeps track of the size of the stack

    @SuppressWarnings("unchecked")
	public Stack() {
        s = (T[]) new Object[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(T val) {
        if (N == s.length) resize(2 * s.length); // creates a new array if the stack is already full
        s[N++] = val; // increments the size tracking var and stores the T on the top of the stack 
    }

    public T pop() {
        T val = s[--N]; // stores the value on top of the stack
        s[N] = null; // remove the value from the top of the stack 

        if (N > 0 && N == s.length / 4) resize(s.length / 2); // creates a new array if the stack is at most 1/4 full

        return val; 
    }
    
    // standard array copying logic
    @SuppressWarnings("unchecked")
	private void resize(int capacity) {
        T[] copy = (T[]) new Object[capacity];
        
        for (int i = 0; i < N; i++) copy[i] = s[i];

        s = copy;
    }
}

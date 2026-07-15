public class ResizingArrayStack {
    private String[] s; // stores each String on the stack
    private int N = 0; // keeps track of the size of the stack

    public ResizingArrayStack() {
        s = new String[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String val) {
        if (N == s.length) resize(2 * s.length); // creates a new array if the stack is already full
        s[N++] = val; // increments the size tracking var and stores the String on the top of the stack 
    }

    public String pop() {
        String val = s[--N]; // stores the value on top of the stack
        s[N] = null; // remove the value from the top of the stack 

        if (N > 0 && N == s.length / 4) resize(s.length / 2); // creates a new array if the stack is at most 1/4 full

        return val; 
    }
    
    // standard array copying logic
    private void resize(int capacity) {
        String[] copy = new String[capacity];
        
        for (int i = 0; i < N; i++) copy[i] = s[i];

        s = copy;
    }
}

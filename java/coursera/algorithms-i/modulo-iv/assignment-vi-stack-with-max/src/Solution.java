public class Solution {
    private Integer[] s; // stores each int on the stack
    private Integer[] max; // keeps track of the maximum number inside of the stack
    private int N = 0; // keeps track of the size of the stack

    public Solution() {
        s = new Integer[1];
        max = new Integer[1];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(int val) {
        if (N == s.length) resize(2 * s.length); // creates a new array if the stack is already full

        // if it's the first element, max stores val. if not, stores the largest between max and val 
        int currentMax = (N == 0) ? val : Math.max(val, max[N - 1]);
        
        max[N] = currentMax; // stores the max value on the top of the stack
        s[N++] = val; // increments the size tracking var and stores the int on the top of the stack 
    }

    public Integer pop() {
        if (isEmpty()) return null;

        int val = s[--N]; // stores the value on top of the stack
        s[N] = null; // remove the value from the top of the stack 
        max[N] = null; // remove the max number from the top of the stack

        if (N > 0 && N == s.length / 4) resize(s.length / 2); // creates a new array if the stack is at most 1/4 full

        return val; 
    }

    public Integer max() {
        if (isEmpty()) return null;

        return max[N - 1];
    }
    
    // standard array copying logic
    private void resize(int capacity) {
        Integer[] copyS = new Integer[capacity];
        Integer[] copyMax = new Integer[capacity];
        
        for (int i = 0; i < N; i++) {
            copyS[i] = s[i];
            copyMax[i] = max[i];
        }

        s = copyS;
        max = copyMax;
    }
}

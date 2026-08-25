import java.security.SecureRandom;

public class KnuthShuffle {
    public void shuffle(Object[] arr) { 
        int N = arr.length;
        SecureRandom random = new SecureRandom();

        for (int i = 0; i < N; i++) {
            int r = random.nextInt(0, i); // gerenates a random uniform index
            
            swap(arr, i, r);
        }
    }

    private static void swap(Object[] arr, int current, int target) {
        Object swap = arr[current]; // temp var that stores the current object
        arr[current] = arr[target]; // swaps current object with the object in the random index
        arr[target] = swap; // random index now stores current object
    }
}

public class ShellSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        int k = 1;

        while (k < N/3) k = 3 * k + 1; // using knuth's sequence as the gap

        while (k >= 1) {
            for (int i = k; i < N; i++) {
                for (int j = i; j >= k && less(arr[j], arr[j - k]); j -= k) exch(arr, j, j - k); // compares j-th element with an element k positions behind and swaps them if j-th is less
            }

            k /= 3; // reduces the gap
        }
        
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

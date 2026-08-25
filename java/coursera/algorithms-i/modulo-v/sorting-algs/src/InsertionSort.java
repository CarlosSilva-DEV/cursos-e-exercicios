public class InsertionSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;

        for (int i = 0; i < N; i++) { // traverses every element of the array
            for (int j = i; j > 0; j--) { // traverses the array in reverse order, starting from the i-th item
                if (less(arr[j], arr[j - 1])) exch(arr, j, j - 1); // compares j-th element with previous element and swap them
                else break;
            }
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

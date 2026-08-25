public class SelectionSort {
    public static void sort(Comparable[] arr) {
        int N = arr.length;

        for (int i = 0; i < N; i++) { // traverses every item of the array
            int min = i; // keeps track of the minimum element's index 
            for (int j = i + 1; j < N; j++) { // traverses the array in ascending order, starting from the i + 1th item 
                if (less(arr[j], arr[min])) min = j; // if j-th element is less than the minimum element, j-th is now the minimum 
            }
            exch(arr, i, min); // swaps current element with the minimum element
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

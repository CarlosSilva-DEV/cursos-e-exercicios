public class Solution {
    public static boolean isPermutation(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false; // if the arrays don't have the same length, they cannot be permutations of each other 

        // sorting arrays for validating permutation
        mergeSort(arr1, 0, arr1.length - 1); 
        mergeSort(arr2, 0, arr2.length - 1); 

        // linear comparison of sorted arrays
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }

        return true; // if all elements match, returns true
    }

    // merge sort implementation
    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            // recursively sorting the left and right halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right); // merging the sorted halves
        }
    }

    private static void merge(int[] arr, int left, int middle, int right) {
        // find length of both subarrays to be merged
        int lLength = middle - left + 1;
        int rLength = right - middle;

        // create temp arrays
        int[] lTemp = new int[lLength];
        int[] rTemp = new int[rLength];

        // copying data to temp arrays
        for (int i = 0; i < lLength; ++i) lTemp[i] = arr[left + i]; 
        for (int j = 0; j < rLength; ++j) rTemp[j] = arr[middle + 1 + j]; 

        int i = 0, j = 0; // initialize pointers of subarrays
        int k = left; // tracks where the next int will be stored in the original array

        while (i < lLength && j < rLength) {
            if (lTemp[i] <= rTemp[j]) arr[k] = lTemp[i++]; // assigns left subarray's element and increment i
            else arr[k] = rTemp[j++]; // assigns right subarray's element and increment j
            k++;
        }

        // copies remaining elements from left and right subarrays
        while (i < lLength) {
            arr[k++] = lTemp[i++];
        }

        while (j < rLength) {
            arr[k++] = rTemp[j++];
        }
    }
}

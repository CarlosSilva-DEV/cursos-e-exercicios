public class Solution {
    public static int bitonicSearch(int[] arr, int target) {
        int n = arr.length;
        int peak = findPeak(arr, 0, n - 1); // finds the bitonic peak

        if (arr[peak] == target) { // compares the bitonic peak with the target and, if equals, return its index
            return peak;
        }

        // binary search on the left half of the array
        int leftSearch = binarySearch(arr, 0, peak - 1, target, true);

        if (leftSearch != -1) {
            return leftSearch;
        }

        // binary search on the right half of the array
        return binarySearch(arr, peak + 1, n - 1, target, false);
    }

    private static int findPeak(int[] arr, int first, int last) {
        while (first < last) {
            int mid = first + (last - first) / 2; // find the mid element of the array

            if (arr[mid] < arr[mid + 1]) { // compares mid element with next element
                first = mid + 1; // if next element is greater, the peak can be in the right half
            } else {
                last = mid; // if not, the peak can be in the left half 
            }
        }

        return first;
    }

    private static int binarySearch(int[] arr, int first, int last, int target, boolean isAscending) {
        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (arr[mid] == target) { // compares mid and target on each iteration
                return mid;
            }

            // if the array is in ascending order, checks whether mid element is bigger or less than target
            if (isAscending) {
                if (arr[mid] < target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            } else { // descending order logic
                if (arr[mid] > target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }

        return -1; // if not found, returns -1
    }
}

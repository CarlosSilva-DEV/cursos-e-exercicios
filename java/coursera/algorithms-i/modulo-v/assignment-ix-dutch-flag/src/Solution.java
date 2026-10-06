public class Solution {
    public static void dnf(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1; // tracks lowest, current and highest numbers, in other words, where each pebble should be

        while (mid <= high) {
            if (arr[mid] == 0) { // swaps and increments pointers if current pebble is red
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) { // only increments pointer, since all white pebbles should be in the mid when the array is sorted
                mid++;
            } else {
                swap(arr, mid, high); // swaps and decrements pointer if current pebble is blue
                high--;
            }
        }
    }

    // standard element-swapping
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

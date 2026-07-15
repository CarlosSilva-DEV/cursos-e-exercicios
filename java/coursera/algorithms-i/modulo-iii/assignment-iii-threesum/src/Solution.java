import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<int[]> threeSum(int[] nums) {
        List<int[]> result = new ArrayList<>();
        quickSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue; // skipping duplicate ints 

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // sums current, next and last ints

                if (sum == 0) {
                    result.add(new int[] {nums[i], nums[left], nums[right]}); // initialize and add new array to list
                    left++; // increment left pointer
                    right--; // decrement right pointer

                    while (left < right && nums[left] == nums[left - 1]) left++; // skipping duplicates for left pointer only 

                } else if (sum < 0) { // increment left pointer to get a larger sum
                    left++;
                } else { // decrement right pointer to get a smaller sum
                    right--;
                }
            }
        }

        return result;
    }

    // sorting
    private static void quickSort(int[] array, int start, int end) {
        if (end <= start) return; // base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1); // partition and sort the left half recursively
        quickSort(array, pivot + 1, end); // partition and sort the right half recursively
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end]; // the array's last int, which is set as the pivot
        int i = start - 1; // pointer starts as -1

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) { // any int that is less than the pivot
                i++; // increments pointer i
                int temp = array[i]; // swapping ints pointed by i and j in array
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // putting the pivot (array[end]) in its right place (array[i])
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}

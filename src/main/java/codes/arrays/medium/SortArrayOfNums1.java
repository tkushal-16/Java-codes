package codes.arrays.medium;

//This is OPTIMAL APPROACH
public class SortArrayOfNums1 {

    static class Solution {
        // Function to sort array containing 0s, 1s, and 2s using Dutch National Flag Algorithm
        public void sortZeroOneTwo(int[] nums) {
            // Initialize three pointers: low and mid at 0, high at the end
            int low = 0, mid = 0, high = nums.length - 1;

            // Continue processing until mid-crosses high
            while (mid <= high) {
                // If current element is 0, swap with low and move both low and mid forward
                if (nums[mid] == 0) {
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                }
                // If current element is 1, just move mid forward
                else if (nums[mid] == 1) {
                    mid++;
                }
                // If current element is 2, swap with high and move only high backward
                else {
                    int temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                }
            }
        }
    }


    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};

        obj.sortZeroOneTwo(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
/*
Complexity Analysis

Time Complexity: O(n) The array is traversed only once using the `mid` pointer. Each element is checked at most once, and swaps are done in constant time.

Space Complexity: O(1) Only a few integer pointers (`low`, `mid`, `high`) are used. Sorting is done in-place, requiring no additional space.
 */
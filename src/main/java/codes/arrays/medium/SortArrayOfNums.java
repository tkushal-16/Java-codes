package codes.arrays.medium;
/**
 * Sort an array of 0s, 1s and 2s
 *
 * Problem Statement: Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.
 *
 * Examples
 * Input: nums = [1, 0, 2, 1, 0]
 * Output: [0, 0, 1, 1, 2]
 * Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two
 *
 * Input: nums = [0, 0, 1, 1, 1]
 * Output: [0, 0, 1, 1, 1]
 * Explanation: The nums array in sorted order has 2 zeroes, 3 ones and zero twos.
 *
 * Link : https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s
 */

//This is BRUTE FORCE APPROACH
public class SortArrayOfNums {

    static class Solution {
        // Function to sort the array containing only 0s, 1s and 2s
        public void sortZeroOneTwo(int[] nums) {
            // Initialize count variables for 0s, 1s, and 2s
            int count0 = 0, count1 = 0, count2 = 0;

            // Count the frequency of 0s, 1s, and 2s
            for(int num : nums) {
                if(num == 0) count0++;
                else if(num == 1) count1++;
                else count2++;
            }

            // Overwrite the array with sorted values
            int index = 0;

            // Fill with 0s
            while(count0-- > 0) {
                nums[index++] = 0;
            }

            // Fill with 1s
            while(count1-- > 0) {
                nums[index++] = 1;
            }

            // Fill with 2s
            while(count2-- > 0) {
                nums[index++] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 1, 0};

        Solution obj = new Solution();
        obj.sortZeroOneTwo(nums);

        for(int num : nums) {
            System.out.print(num + " ");
        }
    }
}
/*
Complexity Analysis
Time Complexity: O(n),We traverse the array twice: once to count, once to overwrite. Each operation is O(n).

Space Complexity: O(1), We use only a constant number of counters regardless of the input size. No extra array is used.
 */
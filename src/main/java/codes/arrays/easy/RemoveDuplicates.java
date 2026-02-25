package codes.arrays.easy;

import java.util.HashSet;

/**
 * Remove Duplicates in-place from Sorted Array
 *
 * Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.
 *
 * If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
 *f
 * Examples
 * Input: arr[]=[1,1,2,2,2,3,3]
 * Output: [1,2,3,_,_,_,_]
 * Explanation: Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.
 * Input: arr[]=[1,1,1,2,2,3,3,3,3,4,4]
 * Output: [1,2,3,4,_,_,_,_,_,_,_]
 * Explanation: Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.
 */

//This is BRUTE FORCE APPROACH
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Solution class containing removeDuplicates method
    static class Solution {
        // Removes duplicates using HashSet and returns count of unique elements
        public int removeDuplicates(int[] nums) {
            // HashSet to store unique elements we have seen
            HashSet<Integer> seen = new HashSet<>();

            // Position to overwrite next unique element
            int index = 0;

            // Loop over each number in nums
            for (int num : nums) {
                // If num is not in the set, it is unique
                if (!seen.contains(num)) {
                    // Add num to the set
                    seen.add(num);

                    // Write num at current index position
                    nums[index] = num;

                    // Move index forward
                    index++;
                }
            }
            // Return number of unique elements
            return index;
        }
    }
}

/*
  Complexity Analysis
  Time Complexity: O(N), We traverse the entire array and insert elements into set.
  Space Complexity: O(N), additional space used to store elements in set.
 */
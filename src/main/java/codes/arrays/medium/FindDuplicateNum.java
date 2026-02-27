package codes.arrays.medium;

import java.util.Arrays;

/**
 * Find the duplicate in an array of N+1 integers
 *
 * Problem Statement: Given an array of N + 1 size, where each element is between 1 and N. Assuming there is only one duplicate number, your task is to find the duplicate number.
 *
 * Examples
 * Example 1:
 * Input:
 *  arr = [1, 3, 4, 2, 2]
 * Output:
 *  2
 * Explanation:
 *  Since 2 is the duplicate number, the answer will be 2.
 *
 * Example 2:
 * Input:
 *  arr = [3, 1, 3, 4, 2]
 * Output:
 *  3
 * Explanation:
 *  Since 3 is the duplicate number, the answer will be 3.
 *
 *  Link : https://takeuforward.org/data-structure/find-the-duplicate-in-an-array-of-n1-integers
 */

//This is BRUTE FORCE APPROACH
public class FindDuplicateNum {
    static class Solution {
        // find the duplicate by sorting and checking adjacent elements
        static int findDuplicate(int[] arr) {
            // get size
            int n = arr.length;
            // sort array in-place
            Arrays.sort(arr);
            // scan adjacent pairs
            for (int i = 0; i < n - 1; i++) {
                // return when a duplicate is found
                if (arr[i] == arr[i + 1]) {
                    return arr[i];
                }
            }
            // fallback if no duplicate found
            return -1;
        }
    }


    // program entry
    public static void main(String[] args) {
        // declare and initialize array
        int[] arr = new int[]{1, 3, 4, 2, 2};
        // print result
        System.out.println("The duplicate element is " + Solution.findDuplicate(arr));
    }

}
/*
Complexity Analysis
Time Complexity: O(N log N), where N is the size of the array. This is because we are sorting the array, which takes O(N log N) time.

Space Complexity: O(1), as we are sorting the array in-place and not using any additional data structures that grow with input size.
 */
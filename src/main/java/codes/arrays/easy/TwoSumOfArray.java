package codes.arrays.easy;

/*
Two Sum : Check if a pair with given sum exists in Array

Problem Statement: Given an array of integers arr[] and an integer target.

1st variant: Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO.
2nd variant: Return indices of the two numbers such that their sum is equal to the target. Otherwise, we will return {-1, -1}.

Input: N = 5, arr[] = {2,6,5,8,11}, target = 14
Output : YES
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for first variant for second variant output will be : [1,3].

Input: N = 5, arr[] = {2,6,5,8,11}, target = 15
Output : NO.
Explanation: There exist no such two numbers whose sum is equal to the target.
 */

//This is BRUTE FORCE APPROACH
public class TwoSumOfArray {
    static class Solution {
        // Function to check if any two numbers sum up to target (variant 1)
        public String twoSumExists(int[] arr, int target) {
            int n = arr.length;
            // Outer loop picks one element at a time
            for (int i = 0; i < n; i++) {
                // Inner loop searches for another element that complements arr[i]
                for (int j = i + 1; j < n; j++) {
                    // If sum equals target, return "YES"
                    if (arr[i] + arr[j] == target) {
                        return "YES";
                    }
                }
            }
            // No pair found that sums to target
            return "NO";
        }

        // Function to return indices of two numbers that sum to target (variant 2)
        public int[] twoSumIndices(int[] arr, int target) {
            int n = arr.length;
            // Outer loop picks one element at a time
            for (int i = 0; i < n; i++) {
                // Inner loop searches for another element that complements arr[i]
                for (int j = i + 1; j < n; j++) {
                    // If sum equals target, return the pair of indices
                    if (arr[i] + arr[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            // No such pair found
            return new int[]{-1, -1};
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;

        // Variant 1
        System.out.println(sol.twoSumExists(arr, target));

        // Variant 2
        int[] res = sol.twoSumIndices(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
/*
Complexity Analysis
Time Complexity: O(N²) because we use two nested loops to check every possible pair of elements in the array, where N is the size of the array.
Space Complexity: O(1) as we use a constant amount of extra space regardless of input size.
 */
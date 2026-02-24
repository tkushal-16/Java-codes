package codes.arrays.basic;

/*
Left Rotate the Array by One

Problem Statement: Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array.

Example 1:
Input:
 nums = [1, 2, 3, 4, 5]
Output:
 [2, 3, 4, 5, 1]
Explanation:
 Initially, nums = [1, 2, 3, 4, 5]
Rotating once to the left results in nums = [2, 3, 4, 5, 1].
 */

//This is BRUTE FORCE APPROACH
public class LeftRotateArray {

    // Class containing the solve method
    static class Solution {

        // Function to solve and shift array elements left by one position
        public static void solve(int[] arr, int n) {
            int[] temp = new int[n];  // Temporary array to store shifted elements

            // Shift elements to the left by one position
            for (int i = 1; i < n; i++) {
                temp[i - 1] = arr[i];
            }
            temp[n - 1] = arr[0];  // First element moves to the last position

            // Print the rotated array
            for (int i = 0; i < n; i++) {
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;  // Size of the array
        int[] arr = {1, 2, 3, 4, 5};  // Original array

        Solution.solve(arr, n);  // Call the solve function from Solution class
    }
}
/*
Complexity Analysis
Time Complexity: O(N), where N is the size of the array. This is because we traverse the array once to shift the elements.

Space Complexity: O(N), as we are using a temporary array of the same size as the input array to store the shifted elements.
 */
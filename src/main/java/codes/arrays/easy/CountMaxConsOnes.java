package codes.arrays.easy;

/*
Count Maximum Consecutive One's in the array

Problem Statement: Given an array that contains only 1 and 0 return the count of maximum
consecutive ones in the array.

Example 1:
Input: prices = {1, 1, 0, 1, 1, 1}
Output: 3
Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

Example 2:
Input: prices = {1, 0, 1, 1, 0, 1}
Output: 2
Explanation: There are two consecutive 1's in the array

link of program : https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array
 */

public class CountMaxConsOnes {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 2, 1, 1};

        // Get answer
        int ans = findMaxConsecutiveOnes(nums);

        // Print result
        System.out.println("The maximum consecutive 1's are " + ans);
    }

    // Function to find maximum consecutive 1's in an array
    public static int findMaxConsecutiveOnes(int[] nums) {
        // Variable to store current count of consecutive 1's
        int cnt = 0;
        // Variable to store maximum consecutive 1's
        int maxi = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If current element is 1, increment count
            if (nums[i] == 1) {
                cnt++;
            } else {
                // If element is 0, reset count
                cnt = 0;
            }

            // Update maximum if current count is greater
            maxi = Math.max(maxi, cnt);
        }

        // Return maximum consecutive 1's
        return maxi;
    }
}

/*
Complexity Analysis

Time Complexity: O(N), since we scan the array once.

Space Complexity: O(1), as only constant extra variables are used.
 */

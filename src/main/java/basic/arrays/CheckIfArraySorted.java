package basic.arrays;

/**
 * Example 1:
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: True.
 * Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
 *
 * Example 2:
 * Input: N = 5, array[] = {5,4,6,7,8}
 * Output: False.
 * Explanation: The given array is Not sorted i.e Every element in the array is not smaller than or equal to its next values, So the answer is False.
 * Here element 5 is not smaller than or equal to its future elements.
 */

public class CheckIfArraySorted {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5};
        int n = 5;
        boolean ans = isSorted(arr, n);
        // Output result
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }

    // Function to check if the array is sorted
    static boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])  // If any element is smaller than the previous one, return false
                return false;
        }
        return true;  // Return true if the array is sorted
    }
}

/*
Complexity Analysis

Time Complexity: O(N), as it checks each adjacent pair once in a single pass through the array.

Space Complexity: O(1), as it uses constant extra space regardless of input size.
 */

package codes.arrays.basic;

import java.util.Arrays;

/*
Example 1:
Input:
 [1, 2, 4, 7, 7, 5]
Output:

Second Smallest : 2
Second Largest : 5
Explanation:
  The elements are sorted as 1, 2, 4, 5, 7, 7.
Hence, the second smallest element is 2, and the second largest element is 5.

Example 2:
Input:
 [1]
Output:

Second Smallest : -1
Second Largest : -1
Explanation:
  Since there is only one element in the array, it is both the largest and smallest element.
Therefore, there is no second smallest or second-largest element present.
 */

//This is BURTE FORCE APPROACH
public class SecondSmallest {

    public static void main(String[] args) {
        // Initialize the array with elements
        int[] arr = {1, 2, 4, 6, 7, 5};

        // Calculate the size of the array
        int n = arr.length;

        // Call the method to find and print the second smallest and second-largest elements
        getElements(arr, n);
    }

    // Method to find the second smallest and second-largest elements in the array
    public static void getElements(int[] arr, int n) {

        // Edge case: when the array has less than 2 elements
        if (n == 0 || n == 1) {
            System.out.println(-1 + " " + -1);  // Print -1 for both second smallest and second largest
            return;
        }

        // Sort the array to easily find the second smallest and second largest elements
        Arrays.sort(arr);

        // Second-smallest element is at index 1 after sorting
        int small = arr[1];

        // Second-largest element is at index n-2 after sorting
        int large = arr[n - 2];

        // Output the second smallest and second-largest elements
        System.out.println("Second smallest is " + small);
        System.out.println("Second largest is " + large);
    }
}

/*
Complexity Analysis
Time Complexity: O(N log N), for sorting the array.

Space Complexity: O(1), as we are using a constant amount of space for variables.
 */

package codes.arrays.easy;
/**
 * Move all Zeros to the end of the array
 *
 * Problem Statement: You are given an array of integers, your task is to move all the zeros in
 * the array to the end of the array and move non-negative integers to the front by maintaining their order.
 *
 * Examples
 * Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
 * Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 * Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 * Input : 1,2,0,1,0,4,0
 * Output: 1,2,1,4,0,0,0
 * Explanation : All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 *
 * Link : https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array
 */

//This is BRUTE FORCE APPROACH
public class MoveZeroToEnd {

    public static int[] moveZeroes(int[] arr) {
        // Create temp array
        int[] temp = new int[arr.length];

        // Pointer for temp
        int index = 0;

        // Traverse input array
        for (int i = 0; i < arr.length; i++) {
            // If non-zero, copy to temp
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy temp back to original
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        // Return updated array
        return arr;
    }

    public static void main(String[] args) {
        // Input array
        int[] arr = {0, 1, 0, 3, 12};

        // Call the function
        int[] result = moveZeroes(arr);

        // Print the result
        System.out.print("Array after moving zeroes: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
/*
 * Complexity Analysis
 * Time Complexity: O(N), we can move all zeroes to end in linear time.
 * Space Complexity: O(N), additional space used for temporary array.
 */
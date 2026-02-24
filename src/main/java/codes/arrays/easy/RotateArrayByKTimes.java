package codes.arrays.easy;

import java.util.Arrays;

/**
 * Rotate array by K elements
 *
 *Problem Statement: Given an array of integers, rotating array of elements by k elements either left or right.
 *
 * Examples
 * Input : nums = [1, 2, 3, 4, 5, 6, 7], k = 2, right
 * Output : [6, 7, 1, 2, 3, 4, 5]
 * Explanation : rotate 1 step to the right: [7, 1, 2, 3, 4, 5, 6]
 * rotate 2 steps to the right: [6, 7, 1, 2, 3, 4, 5]
 *
 * Input : nums = [1, 2, 3, 4, 5, 6], k=2, left
 * Output : [3, 4, 5, 6, 1, 2]
 * Explanation :rotate 1 step to the left: [2, 3, 4, 5, 6, 1]
 * rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]
 */

//This is BRUTE FORCE APPROACH
public class RotateArrayByKTimes {

    // Rotate the array to the right by k positions
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Store last k elements
        int[] temp = Arrays.copyOfRange(arr, n - k, n);

        // Shift the remaining elements to the right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Copy the stored elements to the front
        if (k >= 0) System.arraycopy(temp, 0, arr, 0, k);
    }

    // Rotate the array to the left by k positions
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;

        // Store first k elements
        int[] temp = Arrays.copyOfRange(arr, 0, k);

        // Shift remaining elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Copy stored elements to the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        rotateRight(arr, k);
        System.out.println("Array after right rotation: " + Arrays.toString(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        rotateLeft(arr2, k);
        System.out.println("Array after left rotation: " + Arrays.toString(arr2));
    }
}
/**
 * Complexity Analysis
 *
 * Time Complexity: O(n), We are performing a constant number of linear operations copying `k` elements and shifting up to `n-k` elements.
 * Space Complexity: O(k) ,A temporary array of size `k` is used to store either the first `k` or last `k` elements depending on the direction of rotation.
 */
package codes.arrays.medium;

/**
 * Rotate Image by 90 degree
 *
 * Problem Statement: Given an N * N 2D integer matrix, rotate the matrix by 90 degrees clockwise.
 * The rotation must be done in place, meaning the input 2D matrix must be modified directly.
 *
 * Input :matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
 * Output :
 * matrix = [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
 *
 * Explanation :
 * First, we transpose the matrix: rows become columns. Then, we reverse each row to simulate 90° clockwise rotation. So element at (0,0) goes to (0,2), (0,1) goes to (1,2), and so on, achieving the rotated layout.
 *
 * Input :
 * matrix = [[0, 1, 1, 2], [2, 0, 3, 1], [4, 5, 0, 5], [5, 6, 7, 0]]
 * Output :
 * matrix = [[5, 4, 2, 0], [6, 5, 0, 1], [7, 0, 3, 1], [0, 5, 1, 2]]
 *
 * Explanation :
 * First, the matrix is transposed: rows become columns. Then, each row is reversed. This moves the last column to the first row, the second last column to the second row, and so on. The original position of each element is rotated 90° clockwise into its new location.
 *
 * Link : https://takeuforward.org/data-structure/rotate-image-by-90-degree
 */

//This is BRUTE FORCE APPROACH
public class RotateMatrixBy90Degree {
    static class Solution {
        // Function to rotate the matrix 90 degrees clockwise using extra space
        public static int[][] rotateClockwise(int[][] matrix) {
            // Get the size of the square matrix
            int n = matrix.length;

            // Create a new matrix of same size to store rotated result
            int[][] rotated = new int[n][n];

            // Traverse each element of original matrix
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    // Place the element at its new rotated position
                    rotated[j][n - i - 1] = matrix[i][j];
                }
            }

            // Return the rotated matrix
            return rotated;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        int[][] rotated = Solution.rotateClockwise(mat);

        System.out.println("Rotated Matrix:");
        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
/*
Complexity Analysis:

Time Complexity: O(N²),Each element of the matrix is visited exactly once and placed into a new matrix, so the time taken is proportional to the total number of elements.
Space Complexity: O(N²),We use an additional matrix of the same size to store the rotated result, leading to O(N²) extra space.
 */

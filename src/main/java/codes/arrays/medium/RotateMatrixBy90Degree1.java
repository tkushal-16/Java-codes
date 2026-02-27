package codes.arrays.medium;


//This is OPTIMAL APPROACH
public class RotateMatrixBy90Degree1 {
    static class Solution {
        // Function to rotate matrix 90 degrees clockwise in-place
        public void rotateClockwise(int[][] matrix) {
            int n = matrix.length;

            // Step 1: Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // Swap element at (i, j) with (j, i)
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Step 2: Reverse each row
            for (int i = 0; i < n; i++) {
                int left = 0, right = n - 1;

                // Swap elements from both ends moving toward center
                while (left < right) {
                    int temp = matrix[i][left];
                    matrix[i][left] = matrix[i][right];
                    matrix[i][right] = temp;
                    left++;
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        Solution obj = new Solution();
        obj.rotateClockwise(matrix);

        // Print rotated matrix
        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
/*
Complexity Analysis

Time Complexity: O(N²),We traverse every element once during transposition and again during reversal of each row, resulting in a total of O(N²) time.
Space Complexity: O(1),All operations are done in-place using only temporary variables. No extra matrix is used.
 */
package codes.arrays.medium;

/**
 * Search in a sorted 2D matrix
 *
 * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively.
 * The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the
 * previous row (if it exists). You are given an integer ‘target’ and your task is to find if it exists in the given 'mat' or not.
 *
 * Examples
 * Input :mat = [ [1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12] ], target = 8
 * Output :True.
 * Explanation :The target = 8 exists in the 'mat' at index (1, 3).
 *
 * Input :mat = [ [1, 2, 4], [6, 7, 8], [9, 10, 34] ], target = 78
 * Output :false.
 * Explanation :The target = 78 does not exist in the 'mat'. Therefore in the output, we see 'false'.
 *
 *
 * Link : https://takeuforward.org/data-structure/search-in-a-sorted-2d-matrix
 */

//This is BRUTE FORCE APPROACH
public class SearchIn2DMatrix {
    public static class Solution {
        // Function to search for a target value in the matrix
        public boolean searchMatrix(int[][] matrix, int target) {
            // Get number of rows in the matrix
            int n = matrix.length;

            // Get number of columns in the matrix
            int m = matrix[0].length;

            // Traverse each row
            for (int i = 0; i < n; i++) {
                // Traverse each column in the current row
                for (int j = 0; j < m; j++) {
                    // Check if the current element matches the target
                    if (matrix[i][j] == target)
                        return true;
                }
            }

            // Return false if the target is not found
            return false;
        }
    }

    public static void main(String[] args) {
        // Define a 2D matrix
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // Create an object of the Solution class
        Solution obj = new Solution();

        // Call the searchMatrix function and print the result
        if (obj.searchMatrix(matrix, 8))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
/*
Complexity Analysis

Time Complexity: O(n × m), We are traversing the entire matrix with `n` rows and `m` columns. In the worst case, we may end up visiting every cell once if the target is not present. So, the total number of operations is proportional to the number of elements in the matrix.
Space Complexity: O(1),We are not using any additional space. The algorithm uses a constant amount of extra memory regardless of the size of the matrix just loop variables and the target. Therefore, the space complexity is constant.
 */
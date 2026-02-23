package codes.arrays.basic;
//This is the OPTIMAL APPROACH OF THIS KIND OF PROGRAM
public class LeftRotateArray1 {
    static class Solution {
        public void rotateArrayByOne(int[] nums) {
            // Store the first element in a temporary variable
            int temp = nums[0];

            // Shift elements to the left
            for (int i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }

            // Place the first element at the end
            nums[nums.length - 1] = temp;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5};

        solution.rotateArrayByOne(nums);

        // Output the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
/*
Complexity Analysis
Time Complexity: O(N), where N is the size of the input array. This is because we traverse the array once to shift the elements.

Space Complexity: O(1), as we are using only a constant amount of extra space for the temporary variable.
 */
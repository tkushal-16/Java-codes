/*
Merging Arrays

To merge two arrays, create a new array large enough to hold all elements and copy them over:
 */
package basic.arrays;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] merged = new int[arr1.length + arr2.length];
        System.out.println("Array1 : " + Arrays.toString(arr1) + "\n" + "Array2 : " + Arrays.toString(arr2));

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged Array : " + Arrays.toString(merged));

        /*
        ## Optimised method of merging

         // Copy elements from arr1
        System.arraycopy(arr1, 0, merged, 0, arr1.length);

        // Copy elements from arr2
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        System.out.println("Merged Array : " + Arrays.toString(merged));
         */
    }
}

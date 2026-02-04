/*
## Deleting Elements from an Array

Deleting an element involves removing it and shifting the remaining elements to fill the gap:

    Determine the position of the element to delete.
    Shift elements to the left, starting from the position after the deleted element.
    Update the array size if necessary.

 */
package basic.arrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int position = 2;
        System.out.println("Initial Array Elements: " + Arrays.toString(arr));

        // Shift elements
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Update last element
        arr[arr.length - 1] = 0; // Or any default value

        System.out.println("After deleting Array Elements: " + Arrays.toString(arr));

    }
}


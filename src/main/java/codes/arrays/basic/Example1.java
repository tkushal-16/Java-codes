package codes.arrays.basic;

import java.util.Arrays;

/*
## Inserting Elements into an Array

Inserting an element into an array requires shifting existing elements to make room. Here's a step-by-step process:

    Determine the position for insertion.
    Shift elements to the right, starting from the last element.
    Insert the new element into the empty position.
    Update the array size if necessary.

 */

public class Example1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int newElement = 10;
        int position = 2;
        System.out.println("Initial Array Elements: " + Arrays.toString(arr));

        // Shift elements
        for (int i = arr.length - 1; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert new element
        arr[position] = newElement;

        System.out.println("Array Elements after Insertion: " + Arrays.toString(arr));
    }
}

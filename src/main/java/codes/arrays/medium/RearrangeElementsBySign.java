package codes.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Rearrange Array Elements by Sign
 *
 * Problem Statement: There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
 * Without altering the relative order of positive and negative elements, you must return an array of alternately
 * positive and negative values.
 *
 * Example 1:
 * Input:
 * arr[] = {1,2,-4,-5}, N = 4
 * Output:
 * 1 -4 2 -5
 * Explanation:
 * Positive elements = 1,2
 * Negative elements = -4,-5
 * To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
 *
 *
 * Example 2:
 * Input:
 * arr[] = {1,2,-3,-1,-2,-3}, N = 6
 * Output:
 * 1 -3 2 -1 3 -2
 * Explanation:
 * Positive elements = 1,2,3
 * Negative elements = -3,-1,-2
 * To maintain relative ordering, 1 must occur before 2, and 2 must occur before 3.
 * Also, -3 should come before -1, and -1 should come before -2.
 *
 *
 * Link : https://takeuforward.org/arrays/rearrange-array-elements-by-sign
 */

//This is BRUTE FORCE APPROACH
public class RearrangeElementsBySign {

    // Method to rearrange elements so that positives and negatives alternate
    public int[] rearrangeBySign(int[] A, int n) {
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();

    // Step 1: Separate positives and negatives
    for (int i = 0; i < n; i++) {
        if (A[i] > 0)
            pos.add(A[i]); // Add to positives
        else
            neg.add(A[i]); // Add to negatives
    }

    // Step 2: Place positives at even indices and negatives at odd indices
    for (int i = 0; i < n / 2; i++) {
        A[2 * i] = pos.get(i);       // Even index → positive
        A[2 * i + 1] = neg.get(i);   // Odd index → negative
    }

    return A;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -4, -5};
        int n = A.length;

        RearrangeElementsBySign obj = new RearrangeElementsBySign();
        int[] result = obj.rearrangeBySign(A, n);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
/*
Complexity Analysis
Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.

Space Complexity: O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.
 */
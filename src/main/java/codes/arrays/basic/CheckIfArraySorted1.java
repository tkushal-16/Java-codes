package codes.arrays.basic;

import java.util.ArrayList;

//This is OPTIMAL APPROACH
public class CheckIfArraySorted1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        boolean ans = isSorted(arr);
        // Output result
        if (ans)
            System.out.println("True");
        else
            System.out.println("False");
    }

    static boolean isSorted(ArrayList<Integer> nums) {
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < nums.get(i - 1))
                return false;
        }

        return true;
    }
}

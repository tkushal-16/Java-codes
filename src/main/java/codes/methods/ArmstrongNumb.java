package codes.methods;

/*
An Armstrong number (also known as a narcissistic number, pluperfect number, or plenary number) is a
number that equals the sum of its own digits, each raised to the power of the total number of digits in the number.

For example:
 - 153 is an Armstrong number because it has 3 digits, and $1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153$.
 - 9474 is an Armstrong number because $9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474$
*/

import java.util.Scanner;

public class ArmstrongNumb {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num = in.nextInt();

        for (int i = 100 ; i < 1000 ; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean checkArmstrong(int n){
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }
        return sum == original;
    }
}

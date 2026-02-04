package basic.methods;

import java.util.Scanner;

public class IsPrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return c * c > num;
    }
}

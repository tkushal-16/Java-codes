package codes.methods;

import java.util.Scanner;

public class JavaInput {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value : ");

        int n = input.nextInt();

        System.out.println("Entered value is :" + n);
    }
}

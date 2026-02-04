package basic;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit name: ");
        String fruit = in.nextLine();

        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruit");
            case "Apple" -> System.out.println("Sweet healthy red fruit");
            case "Grapes" -> System.out.println("Smallest fruit");
            default -> System.out.println("Please enter the valid fruit");
        }
    }
}

package basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true){
            //taking operator as input
            System.out.println("Enter the operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //taking the two number as input
                System.out.println("Enter the two numbers: ");
                int n1 = in.nextInt();
                int n2 = in.nextInt();

                if (op == '+'){
                    ans = n1 + n2;
                }
                if (op == '-'){
                    ans = n1 - n2;
                }
                if (op == '*'){
                    ans = n1 * n2;
                }
                if (op == '/'){
                    if (n2 != 0) {
                        ans = n1 / n2;
                    }
                }
                if (op == '%'){
                    ans = n1 % n2;
                }
            }else {
                System.out.println("Invalid operation.....!!!");
                break;
            }
            System.out.println("The value is : " + ans);
        }

    }
}

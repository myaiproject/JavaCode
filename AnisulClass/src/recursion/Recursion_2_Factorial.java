package recursion;

import java.util.Scanner;

public class Recursion_2_Factorial {
   static int factorial(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n +" factorial is = "+factorial(n));
    }
}

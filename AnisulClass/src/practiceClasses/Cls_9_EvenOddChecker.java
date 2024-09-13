package practiceClasses;

import java.util.Scanner;

public class Cls_9_EvenOddChecker {
public static void main(String[] args) {

    int num1 ;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter any number:");
    num1 = scanner.nextInt();


    if (num1 % 2 == 1) {
        System.out.println("This is Odd number.");
    }

    else if (num1 % 2 == 0) {
        System.out.println("This is even number.");
    }

    else {
        System.out.println("This is Zero");

    }
}
}

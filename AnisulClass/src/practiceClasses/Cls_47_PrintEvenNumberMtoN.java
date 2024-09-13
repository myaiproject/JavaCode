package practiceClasses;

import java.util.Scanner;

public class Cls_47_PrintEvenNumberMtoN {
    public static void main(String[] args) {

        System.out.print("Enter First number: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();

        System.out.print("Enter Last number: ");
        int lastNum = scanner.nextInt();

        scanner.close();

        if (firstNum  < 1 || lastNum < 1  ){
            System.out.println("Enter positive number.");
            return ; // Exit the program if input is invalid
        }

        // Ensure firstNum is less than or equal to lastNum

        if (firstNum > lastNum) {
            System.out.println("First number should be less than or equal to last number.");
            return; // Exit the program if input is invalid
        }
        // If firstNum is odd, make it the next even number
        if (firstNum  % 2 == 1  ){
            firstNum++ ;

        }
        System.out.print("Even Number are: ");

        for (int i = firstNum ; i<= lastNum ; i += 2){
            System.out.print(" " + i);
        }


    }
}

package practiceClasses;

import java.util.Scanner;

public class Cls_50_MultipleTable1 {
    public static void main(String[] args) {
        int initialNumber, finalNumber;

        // Prompt user for the initial number
        System.out.print("Enter initial number: ");
        Scanner scanner = new Scanner(System.in);
        initialNumber = scanner.nextInt();

        // Prompt user for the final number
        System.out.print("Enter final number: ");
        finalNumber = scanner.nextInt();

        // Generate and print multiplication tables from initialNumber to finalNumber
        for (int i = initialNumber; i <= finalNumber ; i++){
            for (int j = 1; j <= 10 ; j++){
                System.out.println(i+" X "+ j +" = " + i * j);

            }
            System.out.println();// Print a blank line after each table for better readability

        }
        scanner.close();

    }
}

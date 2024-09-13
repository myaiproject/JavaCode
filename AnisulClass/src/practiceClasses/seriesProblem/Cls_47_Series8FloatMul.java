package practiceClasses.seriesProblem;

import java.util.Scanner;

public class Cls_47_Series8FloatMul {
    public static void main(String[] args) {

        double currentNumber, boundaryNumber ,totalProduct = 1 ;

// Prompt user for the boundary number n
        System.out.print("Enter the last value of n: ");
        Scanner scanner = new Scanner(System.in);
        boundaryNumber = scanner.nextDouble();
        scanner.close();

        // Calculate the product of numbers from 1.5 to boundaryNumber
        for (currentNumber = 1.5 ; currentNumber <= boundaryNumber; currentNumber++){
            totalProduct *= currentNumber ;
            System.out.println(totalProduct);
        }

        // Print the result
        System.out.println("product of 1 to " + boundaryNumber + " = " + totalProduct );
    }
}

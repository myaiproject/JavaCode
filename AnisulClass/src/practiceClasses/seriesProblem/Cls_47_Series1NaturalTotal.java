package practiceClasses.seriesProblem;

import java.util.Scanner;

public class Cls_47_Series1NaturalTotal {
    public static void main(String[] args) {
        int currentNumber, boundaryNumber ,totalSum = 0 ;

// Prompt user for the boundary number n
        System.out.print("Enter the last value of n: ");
        Scanner scanner = new Scanner(System.in);
        boundaryNumber = scanner.nextInt();
        scanner.close();

        // Calculate the sum of numbers from 1 to n
        for (currentNumber = 1 ; currentNumber <= boundaryNumber; currentNumber++){
            totalSum = totalSum +currentNumber ;
        }

        // Print the result
        System.out.println("TotalSum of 1 to " + boundaryNumber + " = " + totalSum );

    }
}

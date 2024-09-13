package practiceClasses.seriesProblem;

import java.util.Scanner;

public class Cls_47_Series5naturalSquareTotal {
    public static void main(String[] args) {
        int currentNumber , boundaryNumber,totalSum = 0;

        //prompt user give boundary number
        System.out.print("Enter boundary Number: ");
        Scanner scanner = new Scanner(System.in);
        boundaryNumber = scanner.nextInt();
        scanner.close();

        // Calculate the sum of numbers from 1 to n
        for (currentNumber = 1 ; currentNumber <= boundaryNumber ; currentNumber ++){

            totalSum = totalSum + currentNumber * currentNumber;

        }

        //Print the result
        System.out.println("Total sum 1^2 to "+ boundaryNumber+"^2 = "+ totalSum );
    }
}

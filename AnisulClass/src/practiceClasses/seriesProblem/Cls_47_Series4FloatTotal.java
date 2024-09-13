package practiceClasses.seriesProblem;

import java.util.Scanner;

public class Cls_47_Series4FloatTotal {
    public static void main(String[] args) {
        double currentNumber , boundaryNumber,totalSum = 0;

        //prompt user give boundary number
        System.out.print("Enter boundary Number: ");
        Scanner scanner = new Scanner(System.in);
        boundaryNumber = scanner.nextDouble();
        scanner.close();

        // Calculate the sum of numbers from 1 to n
        for (currentNumber = 1.5 ; currentNumber <= boundaryNumber ; currentNumber ++){

            totalSum = totalSum + currentNumber;

        }

        //Print the result
        System.out.println("Total sum 1 to "+ boundaryNumber +" = "+ totalSum );
    }
}

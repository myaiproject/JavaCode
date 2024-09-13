package practiceClasses;

import java.util.Scanner;

public class Cls_49_Factorial {
    public static void main(String[] args) {

        int inputNumber , factorial = 1 ;


        Scanner scanner = new Scanner(System.in);



        // Prompt user input for the factorial number
        // Infinite loop to keep prompting for a positive number
        while (true) {
            System.out.print("Enter a positive number: ");
            inputNumber = scanner.nextInt();

            // Check if the input is a non-negative number
            if (inputNumber >= 0) {
                break;
            } else {
                System.out.println("Please enter a positive number.");
            }
        }
        scanner.close();

        //handle zero factorial
        if (inputNumber == 0){
            System.out.println(inputNumber+ "! = 1");
        }
        //factorial a number
        else {
            for (int i = 1 ; i <= inputNumber ; i++){
                factorial = factorial * i ;
            }
            System.out.println(inputNumber+"! = "+factorial);
        }

    }
}

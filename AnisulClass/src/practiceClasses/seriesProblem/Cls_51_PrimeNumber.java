package practiceClasses.seriesProblem;

import java.util.Scanner;

public class Cls_51_PrimeNumber {
    public static void main(String[] args) {
        
// Prompt user for a positive number
        Scanner scanner = new Scanner(System.in);
        int num , i , count = 0;

        System.out.print("Enter any positive Number:");
        num = scanner.nextInt();

        for (i = 2 ; i < num ; i++){

            if (num % i == 0){
                count++;
                break;
            }
        }

        //check if no change count initial value
        if (count == 0){
            System.out.println(num + " is prime Number.");
        }

        //check if change count initial value
        else {
            System.out.println(num + " is non-Prime Number.");
        }
        scanner.close();
    }
}

package practiceClasses;

import java.util.Scanner;

public class Cls_51_BestPrimeNumber {
    public static void main(String[] args) {

        // Prompt user for a positive number
        Scanner scanner = new Scanner(System.in);
        int num ;

        System.out.print("Enter any positive Number: ");
        num = scanner.nextInt();

        // Check if the input number is less than 2
        if (num < 2){
            System.out.println("Enter greater than 2 positive Number: ");
            return;
        }
        boolean isPrime = true;

        // Check for factors from 2 to the square root of num
        //29 k er ager borgo number 25.akhon 25 er root 5 ,akhon 2 ,3,4,5 dara nisshese vag koragele prime na.
        for (int i = 2 ; i < Math.sqrt(num) ; i++) {
            System.out.println(i);
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }
            // Output the result
            if (isPrime){
                System.out.println(num + " is a prime number.");
            }
            else {
                System.out.println(num + " is not a prime number.");
            }

    }
}

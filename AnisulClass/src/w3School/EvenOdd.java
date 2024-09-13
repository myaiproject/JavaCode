package w3School;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        System.out.print("Enter any number: ");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        
        if (num > 0){
            System.out.println("This is positive number.");
        } else if (num < 0) {
            System.out.println("This is negative  number.");
            
        }

        else {
            System.out.println("This is zero.");
        }
    }
}

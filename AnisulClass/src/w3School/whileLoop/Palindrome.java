package w3School.whileLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int num ,sum =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = scanner.nextInt();

        int originalNum = num;
        while (num != 0){
            sum = sum * 10 + (num % 10);
            num = num / 10;//num is being modified
        }
        System.out.println(" " + sum);
        if (originalNum == sum ){
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("This is not palindrome");
        }
    }
}

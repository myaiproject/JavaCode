package assaignment;

import java.util.Scanner;

public class Ass_6_DigitSpellingArray {
    public static void main(String[] args) {
        String[] spelling = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"};


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digit zero to nine: ");
        int digit = scanner.nextInt();

        if (digit >= 0 && digit <= 9) {
            System.out.println(spelling[digit]);
        } else {
            System.out.println("Invalid input!");
        }
    }
}

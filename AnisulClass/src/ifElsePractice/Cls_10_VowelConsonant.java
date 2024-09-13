package ifElsePractice;

import java.util.Scanner;

public class Cls_10_VowelConsonant {
    public static void main(String[] args) {

        System.out.print("Enter a letter:");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){


            System.out.println("'" + ch + "' is a vowel");
        }
        else {

            System.out.println("'" + ch + "' is consonant");
        }
        scanner.close();

        
    }
}

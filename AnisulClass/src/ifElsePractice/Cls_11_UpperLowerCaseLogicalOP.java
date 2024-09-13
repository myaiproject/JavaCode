package ifElsePractice;

import java.util.Scanner;

public class Cls_11_UpperLowerCaseLogicalOP {
public static void main(String[] args) {

    System.out.print("Enter a letter:");

    Scanner scanner = new Scanner(System.in);
    char ch = scanner.next().charAt(0);

    if (ch >= 'a' && ch <= 'z'){
        System.out.println("'" +ch+ "' is lowercase letter!");
    } else if (ch >= 'A' && ch <= 'Z') {
        System.out.println("'" + ch + "' is an uppercase letter!");


    }
    else {
        System.out.println("Invalid input! Please enter a letter.");
    }
    scanner.close();

}
}

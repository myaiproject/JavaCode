package assaignment;

import java.util.Scanner;

public class Ass_5_ValidVoter {
    public static void main(String[] args) {

       // int age ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.print(age + " years is valid voter range!");
        }
        else {
            System.out.print(age + " years is not valid voter range!");
        }

    }
}

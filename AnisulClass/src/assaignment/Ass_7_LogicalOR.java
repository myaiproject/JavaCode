package assaignment;

import java.util.Scanner;

public class Ass_7_LogicalOR {
    public static void main(String[] args) {

        System.out.print("Do you love Java?\n Press y or n:");

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        if (ch == 'Y' || ch == 'y'){
            System.out.println("You are a java lover.");
        }
        else if (ch == 'n' || ch == 'N'){
            System.out.println("You are not a java lover.");
        }

        else {
            System.out.println("Chose only y or n.");
        }
    }
}

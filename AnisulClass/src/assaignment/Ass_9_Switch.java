package assaignment;

import java.util.Scanner;

public class Ass_9_Switch {
    public static void main(String[] args) {
        // Prompt the user to select a language
        System.out.print("1 for Bangla: " +  "\n2 for Hindi: " + "\n3 for Urdu: " + " \n4 English: " + "\nSelect language: ");

        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        switch (digit){
            case 1:
                System.out.println("Bangla.");
                break;
            case 2:
                System.out.println("Hindi.");
                break;
            case 3:
                System.out.println("Urdu.");
                break;
            case 4:
                System.out.println("English.");
                break;

// Inform the user about the invalid input
            default:
                System.out.println("choose 1-4");

        }
    }
}

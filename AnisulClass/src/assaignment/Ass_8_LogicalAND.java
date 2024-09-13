package assaignment;

import java.util.Scanner;

public class Ass_8_LogicalAND {
    public static void main(String[] args) {

        System.out.print("Have you completed your Master's degree?\nIf completed, press y; if not completed, press n: ");
        Scanner scanner = new Scanner(System.in);

        char passMaster = scanner.next().charAt(0);

        System.out.print("Are you fluent in English?\nPress y for yes, n for no: ");
        char fluentEng = scanner.next().charAt(0);

        // Ensure input validation
        if ((passMaster == 'y' || passMaster == 'Y') && (fluentEng == 'y' || fluentEng == 'Y')) {
            System.out.println("Congratulations! You are eligible for the job interview.");
        } else if ((passMaster == 'n' || passMaster == 'N') && (fluentEng == 'y' || fluentEng == 'Y')) {
            System.out.println("Sorry! You are not eligible for the job interview because you haven't completed your Master's degree.");
        } else if ((passMaster == 'y' || passMaster == 'Y') && (fluentEng == 'n' || fluentEng == 'N')) {
            System.out.println("Sorry! You are not eligible for the job interview because you are not fluent in English.");
        } else {
            System.out.println("Sorry! Please choose the correct option.");
        }

        scanner.close();

    }
}

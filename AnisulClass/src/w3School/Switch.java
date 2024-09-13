package w3School;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Enter Day No: ");
        Scanner scanner = new Scanner(System.in);

        int dayNum = scanner.nextInt();
        switch (dayNum){
            case 1:
                System.out.println("Saturday");
                break;

            case 2:
                System.out.println("Sunday");
                break;

            case 3:
                System.out.println("Monday");
                break;

            case 4:
                System.out.println("Tuesday");
                break;

            case 5:
                System.out.println("Wednesday");
                break;

            case 6:
                System.out.println("Thursday");
                break;

            case 7:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Find in bound");

        }


    }
}

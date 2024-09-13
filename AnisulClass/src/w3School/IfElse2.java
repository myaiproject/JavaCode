package w3School;

import java.util.Scanner;

public class IfElse2 {
    public static void main(String[] args) {
        System.out.print("Enter the day number:");

        Scanner scanner = new Scanner(System.in);
        int dayNum = scanner.nextInt();

/*
            if (dayNum == 1){
                System.out.println("This is Saturday");
            }
            else if (dayNum == 2) {
                System.out.println("This is Sunday");

            }

            else if (dayNum == 3) {
                System.out.println("This is Monday");

            }
            else if (dayNum == 4) {
                System.out.println("This is Tuesday");

            }
            else if (dayNum == 5) {
                System.out.println("This is Wednesday");

            }
            else if (dayNum == 6) {
                System.out.println("This is Thursday");

            }
            else if (dayNum == 7) {
                System.out.println("This is Friday");

            }
            else {

                    System.out.println("Ops! Give valid input.");

            }*/

        String result = (dayNum == 1) ? "Saturday" : (dayNum == 2) ? "Sunday" : (dayNum == 3) ? "Monday" : (dayNum == 4) ? "Tuesday" : (dayNum == 5) ? "Wednesday" :(dayNum == 6) ? "Thursday" : (dayNum == 7) ? "Friday" : "Out of bounds" ;

        System.out.println("This is "+ result);

    }
}
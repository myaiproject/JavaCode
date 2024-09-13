package w3School;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {

        System.out.print("Enter pin code for opening the door: ");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();

//        if (pinCode == 1234){
//            System.out.println("Welcome! Allowed to enter the room");
//
//        }
//        else {
//            System.out.println("Wrong password! Not allowed to enter the room");
//        }

        // solve the problem by ternary operator
        String result = (pinCode == 1234)? "Welcome!":"Wrong password!";
        System.out.println(result);
    }
}

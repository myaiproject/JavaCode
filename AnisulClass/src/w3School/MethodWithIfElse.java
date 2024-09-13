package w3School;

import java.util.Scanner;

public class MethodWithIfElse {
    static void checkAge(int age){


        if (age <= 18){
            System.out.println("Access denied.");
        }
        else {
            System.out.println("Access allowed. You are old enough!");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter age = ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        checkAge(a);




    }

}







package practiceClasses;

import java.util.Scanner;

public class Cls_12_ConditionalOperator {
    public static void main(String[] args) {

        System.out.print("Enter two number: ");

        int num1 ,num2  , large;
        Scanner scanner = new Scanner(System.in);

        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        large = (num1 > num2) ? num1 : num2 ;//If num1 is greater than num2, num1 is assigned to large
                                             //If num1 is not greater than num2, num2 is assigned to large.

        System.out.println("Large number = "+ large);

        scanner.close();


    }
}
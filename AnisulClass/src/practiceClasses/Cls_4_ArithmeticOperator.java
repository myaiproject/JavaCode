package practiceClasses;

import java.util.Scanner;

public class Cls_4_ArithmeticOperator {
    public static void main(String[] args) {

        Scanner inputNum1 = new Scanner(System.in);
        double num1 , num2 ,result;

        System.out.print("Enter num1= ");
        num1 = inputNum1.nextDouble();

       // Scanner inputNum2 = new Scanner(System.in);
        System.out.print("Enter num2= ");
        num2 = inputNum1.nextDouble();

        result = num1 + num2 ;
       // System.out.println("Addition = "+ result);
        System.out.println(num1+ " + "+ num2+ " = "+result);

        result = num1 - num2 ;
        //System.out.println("Subtraction = "+ result);
        System.out.println(num1+ " - "+ num2+ " = "+result);

        result = num1 * num2 ;
        //System.out.println("Multiplication = "+ result);
        System.out.println(num1+ " * "+ num2+ " = "+result);

        result = num1 / num2 ;
        //System.out.println("Division = "+ result);
        System.out.println(num1+ " / "+ num2+ " = "+result);

        result = num1 % num2 ;
        //System.out.println("Reminder = "+ result);
        System.out.println(num1+ " % "+ num2+ " = "+result);

        inputNum1.close();






    }
}

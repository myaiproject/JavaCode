package practiceClasses;

import java.util.Scanner;

public class Cls_50_MultipleTable {
    public static void main(String[] args) {

        int num1 , num2 ;
        System.out.print("Enter num1:");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner .nextInt();

        for (num2 = 1 ; num2 <= 10 ; num2++){
           int mulTable = num1 * num2;
            System.out.println(num1 + " X " + num2 + " = "+ mulTable);

        }
    }
}

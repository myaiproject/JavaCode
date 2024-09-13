package practiceClasses;

import java.util.Scanner;

public class Cls_8_NegativePositive {
public static void main(String[] args) {

int num1 ;

Scanner scanner = new Scanner(System.in);

System.out.print("Enter any number:");
num1 = scanner.nextInt();

if (num1 > 0){
    System.out.println("This is Positive.");


}
else if (num1 < 0){
    System.out.println("This is negative.");
}
else {
    System.out.println("This is zero.");
}
}
}

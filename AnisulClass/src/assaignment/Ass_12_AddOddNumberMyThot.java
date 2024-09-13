package assaignment;

import java.util.Scanner;

public class Ass_12_AddOddNumberMyThot {
    public static void main(String[] args) {

        System.out.print("Enter  Start Number:");

        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();

        System.out.print("Enter  End Number:");
        int endNum = scanner.nextInt();

        scanner.close();

        int sum = 0 ;


            // / if both Start and end number are even

            if (startNum % 2 == 0 && endNum % 2 == 0) {
                int i = startNum + 1 ;
                for (int k = i; k < endNum;k = k + 2) {
                    sum = sum + k ;
                }
                System.out.println("Sum of among " + startNum + " to " + endNum + " odd number = " + sum);
            }
            // if both Star and end number are Odd

            else if (startNum % 2 == 1 && endNum % 2 == 1) {

                for (int i = startNum; i <= endNum; i = i + 2) {
                    sum = sum + i;
                }
                System.out.println("Sum of among " + startNum + " to " + endNum + " odd number = " + sum);
            }

            // if start Number is Odd  and end number is even

            else if (startNum % 2 == 1 && endNum % 2 == 0) {

                for (int i = startNum; i < endNum; i = i + 2) {
                    sum = sum + i;
                }
                System.out.println("Sum of among " + startNum + " to " + endNum + " odd number = " + sum);
            }

            // if start Number is even and end number is Odd

            else if (startNum % 2 == 0 && endNum % 2 == 1) {
                int i = startNum + 1;
                for (int k = i; k <= endNum; k = k + 2) {
                    sum = sum + k ;
                }
                System.out.println("Sum of among " + startNum + " to " + endNum + " odd number = " + sum);
            }


        else{
              System.out.println("Enter Natural Number!!");
        }

   }
}

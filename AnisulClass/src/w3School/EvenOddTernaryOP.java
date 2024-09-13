package w3School;

import java.util.Scanner;

public class EvenOddTernaryOP {
      public static void main(String[] args) {
        System.out.print("Enter any value: ");
        Scanner scanner = new Scanner(System.in);

        int myNum = scanner.nextInt();

        String result = (myNum > 0)? "Positive": (myNum < 0)? "Negative" : "Zero";
        System.out.println("This  is "+result);
    }

}

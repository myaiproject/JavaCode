package assaignment;

import java.util.Scanner;

public class Ass_12_OddNumberAddChatGPT {
    public static void main(String[] args) {



    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Number: ");
    int startNum = scanner.nextInt();

        System.out.print("Enter End Number: ");
    int endNum = scanner.nextInt();

        scanner.close();

        if (startNum < 1 || endNum < 1) {
        System.out.println("Enter Natural Numbers (positive integers)!!");
       // return;
    }

    int sum = 0;

    // Ensure startNum is the first odd number if it is even
        if (startNum % 2 == 1) {
        startNum++;
    }

    // Sum all odd numbers from startNum to endNum
        for (int i = startNum; i <= endNum; i += 2) {
        sum += i;
    }

        System.out.println("Sum of odd numbers from " + startNum + " to " + endNum + " = " + sum);
}
}

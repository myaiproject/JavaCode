package assaignment;


import java.util.Scanner;

public class Ass_11_FactorialCalculator {
public static void main(String[] args) {


    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();

    if (n < 0) {
        System.out.println("Enter a positive number:");

    }
    else {
        long  fact = 1 ;
        for (int i = 1 ; i <= n ; i++){
            fact *= i ;
        }
        System.out.println(n+"! = "+fact);
    }
}


}


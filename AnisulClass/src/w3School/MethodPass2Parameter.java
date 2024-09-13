package w3School;

import java.util.Scanner;

public class MethodPass2Parameter {
    static int myMethod(int x , int y ){
        return x + y ;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value of x = ");
        int x1 = scanner.nextInt();

        System.out.println("Enter value of x = ");
        int y1 = scanner.nextInt();

        System.out.println("Sum of "+ x1 +" + "+ y1 +" = "+ myMethod(x1,y1));
        int z = x1 + y1 ;
        System.out.println(" Sum = " +z);
    }
}

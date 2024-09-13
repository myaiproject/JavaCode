package w3School;

import java.util.Scanner;

public class MethodOverLoading {
    static  int plusMethodInt(int x , int y){

        return x + y ;
    }

    static  double plusMethodDouble(double x1 , double y1){

        return x1 + y1 ;
    }

    public static void main(String[] args) {
        // my mind want to do this style

       /*
        Scanner scanner =new Scanner(System.in);

       System.out.print("Enter value of int x = ");
        int x = scanner.nextInt();*/

//        System.out.print("Enter value of int y = ");
//        int y = scanner.nextInt();
//
//        System.out.print("Enter value of Double x1 = ");
//        double x1 = scanner.nextDouble();
//
//        System.out.print("Enter value of Double y1 = ");
//        double y1 = scanner.nextDouble();
//
//        System.out.println("Sum of integer: "+ x +" + "+ y +" = "+ plusMethodInt(x,y));
//        System.out.println("Sum of double: "+ x +" + "+ y +" = "+ plusMethodDouble(x1,y1));

        //w3 style

        int myNum1 = plusMethodInt(4,5);
        double myNum2 = plusMethodDouble(2.5,2.5);
        System.out.println("Int sum = "+ myNum1);
        System.out.println("Double sum = "+ myNum2);
    }
}

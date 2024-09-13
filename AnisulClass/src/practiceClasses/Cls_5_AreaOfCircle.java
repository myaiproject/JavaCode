package practiceClasses;

import java.util.Scanner;

public class Cls_5_AreaOfCircle {
    public static void main(String[] args) {

        int radius ;
        double area ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius = ");
        radius = scanner.nextInt();

        if (radius <= 0){
            System.out.println("Enter positive integer:");
            return;
        }
        area = 3.14 * (double) radius * (double) radius ;
        System.out.println("Area of Circle = " + area + " square unit");
    }
}

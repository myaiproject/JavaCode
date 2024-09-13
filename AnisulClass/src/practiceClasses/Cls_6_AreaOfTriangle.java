package practiceClasses;

import java.util.Scanner;

public class Cls_6_AreaOfTriangle {
    public static void main(String[] args) {

        int length , width ;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length of Triangle: ");
        length = scanner.nextInt();

        System.out.print("Enter Width of Triangle: ");
        width = scanner.nextInt();

        if (length <= 0 || width <= 0){
            System.out.println("Invalid input!!! Enter positive integer:");
            return;
        }

        area = .5 * length * width ;

        System.out.print("Area of Triangle = " +area + " square unit");

        scanner.close();
    }
}

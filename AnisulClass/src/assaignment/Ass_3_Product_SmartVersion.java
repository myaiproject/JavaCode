package assaignment;

import java.util.Scanner;

public class Ass_3_Product_SmartVersion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        System.out.println("Product ID: "+id);
        scanner.nextLine();

        System.out.print("\nEnter Product Title: ");
        String title = scanner.nextLine();
        System.out.println("Product Title: " + title);

        System.out.print("\nEnter Product Price: ");
        String price = scanner.nextLine();
        System.out.println("Product Price: " + price+"euros");

        System.out.print("\nEnter Product Description: ");
        String description = scanner.nextLine();
        System.out.println("Product Description: " + description);

        System.out.print("\nEnter Product Category: ");
        String category = scanner.nextLine();
        System.out.print("Product Category: " + category);

        scanner.close();



    }
}

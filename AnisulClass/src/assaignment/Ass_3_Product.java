package assaignment;

import java.util.Scanner;

public class Ass_3_Product {
    public static void main(String[] args) {

       // int id = 101 ;
        //String title = "iphone15";
       // String price = "1895 euros";
       // String description = "Perfect product with best image quality";
       // String category = "Phone";

        Scanner productId = new Scanner(System.in);
        int id ;
        String title,description,category;
        System.out.print("Enter product ID: ");
        id = productId.nextInt();
        System.out.print("Product ID: " + id);

        System.out.println("\n");

        Scanner productTitle = new Scanner(System.in);
        //String title ;
        System.out.print("Enter product Title: ");
        title= productTitle.nextLine();
        System.out.print("Product Title: " + title);

        System.out.println("\n");

        Scanner productPrice = new Scanner(System.in);
        double price ;
        System.out.print("Enter product Price: ");
        price= productPrice.nextDouble();
        System.out.print("Product Price: " + price + " euros");

        System.out.println("\n");

        Scanner productDescription = new Scanner(System.in);
      //String description ;
        System.out.print("Enter product Description: ");
        description = productDescription.nextLine();
        System.out.print("Product Description: "+description);

        System.out.println("\n");

        Scanner productCategory = new Scanner(System.in);
        //String category ;
        System.out.print("Enter product Category: ");
        category = productCategory.nextLine();
        System.out.print("Product Category: " + category);

    }
}

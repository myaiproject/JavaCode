package assaignment;

public class Ass_1_Product {
    public static void main(String[] args) {

        System.out.println("Id: 101.");
        System.out.println("Title: iphone15.");
        System.out.println("Price: 1849 euros.");
        System.out.println("Description: Perfect product with best image quality.");
        System.out.println("Category: Phone.");
        System.out.println("\n");


        //we can do it in a single print function using \n end of the each segment is called concatenation
        System.out.println("Example of concatenation");

        System.out.println("Id: 101.\n" + "Title: iphone15.\n" + "Price: 1849 euros.\n" +
                "Description: Perfect product with best image quality.\n" +
                "Category: Phone.");

        //concatenation can be replaced with text block (example of text block)
        System.out.println();


        System.out.println("Example of text block");
        String Description = """
                              Id: 101.
                              Title: iphone15.Price: 1849 euros.
                              Description: Perfect product with best image quality.
                              Category: Phone.
                              
                              """;

        System.out.println(Description);





    }
}

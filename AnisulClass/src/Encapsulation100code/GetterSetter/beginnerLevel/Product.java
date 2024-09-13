package Encapsulation100code.GetterSetter.beginnerLevel;

//Default Values
public class Product {
    private String productName = "Unknown";

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static void main(String[] args) {
        Product product = new Product();
        System.out.println("Default product name: " + product.getProductName());
        product.setProductName("Laptop");
        System.out.println("Update product name: " + product.getProductName());
    }
}

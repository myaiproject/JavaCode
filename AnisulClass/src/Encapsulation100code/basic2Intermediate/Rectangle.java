package Encapsulation100code.basic2Intermediate;
//Basic Encapsulation with Simple Class

public class Rectangle {
    private  int length;
    private  int width;

    // Getter and Setter for length

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Getter and Setter for width


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Method to calculate area

    public int calculateArea(){
        return length * width;

    }


}

class Main{
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(3);

        System.out.println("Area of Rectangle:"+ rectangle.calculateArea());
    }
}

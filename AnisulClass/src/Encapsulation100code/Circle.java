package Encapsulation100code;
//Encapsulation with Constructor Initialization

public class Circle {
    private double radius;

    // Constructor to initialize radius

    public  Circle(double radius){

        this.radius = radius;
    }

    // Getter for radius


    public double getRadius() {
        return radius;
    }

    // Method to calculate area
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

 class Main{
     public static void main(String[] args) {
         Circle circle = new Circle(4.5);
         System.out.println("Area of circle: " + circle.calculateArea());
     }

}

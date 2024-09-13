package Encapsulation100code.GetterSetter.intermediateLevel;

// Read-Only Property
public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;

    }

    //Getter method
    public double getRadius() {
        return radius;
    }

    // No setter method, making radius read-only

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
    }
}

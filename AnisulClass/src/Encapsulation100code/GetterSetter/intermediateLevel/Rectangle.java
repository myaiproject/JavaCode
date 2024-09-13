package Encapsulation100code.GetterSetter.intermediateLevel;

//Calculated Property
public class Rectangle {
    private double length;
    public double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    // Calculated property
    public double getArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setLength(5);
        r.setWidth(3);
        System.out.println("Area: " + r.getArea());
    }
}

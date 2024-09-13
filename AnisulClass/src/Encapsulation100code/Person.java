package Encapsulation100code;

public class Person {

        private double radius;

        // Constructor to initialize radius
        public Person(double radius) {
            this.radius = radius;
        }

        // Method to calculate area
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    class Maina {
        public static void main(String[] args) {
            Circle circle = new Circle(4);

            // Trying to access radius directly will cause an error
            // System.out.println(circle.radius); // This would cause a compilation error

            System.out.println("Area of circle: " + circle.calculateArea());
        }
    }


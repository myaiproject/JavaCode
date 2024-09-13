package practiceClasses.OOP.abstraction;

public abstract class Shape {
    double dim1,dim2;
    Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2 ;

    }

    abstract void area();
}

class Rectangle extends Shape{
    Rectangle(double dim1, double dim2){

        super(dim1,dim2);
    }

    @Override
    void area() {
        double result = dim1 * dim2;
        System.out.println("Rectangle are is "+result);
    }
}

class Circle extends Shape{
    //already dim1 dim2 present here
    Circle(double r){
       super(r,r);
    }

    @Override
    void area() {
        double result = Math.PI * dim1 * dim2;

        System.out.printf("Circle area is %.2f%n", result);

    }
}

class Triangle extends Shape{
    Triangle(double dim1 ,double dim2){
        super(dim1,dim2);
    }

    @Override
    void area() {
        double result= .5 * dim1 * dim2;
        System.out.println("Triangle area is "+result);
    }
}

class ShapeTest{
    public static void main(String[] args) {
           Shape shape;
        shape = new Rectangle(10,5);
        shape.area();
        shape = new Circle(10);
        shape.area();
        shape = new Triangle(10,5);
        shape.area();

    }
}


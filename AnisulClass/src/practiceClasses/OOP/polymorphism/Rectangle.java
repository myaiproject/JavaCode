package practiceClasses.OOP.polymorphism;

public class Rectangle extends Shape{
    //already area present here

    double length, width ;
    Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        System.out.println("Area for Rectangle that extends Shape");
return length * width ;
    }
}

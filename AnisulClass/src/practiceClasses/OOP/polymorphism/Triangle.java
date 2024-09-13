package practiceClasses.OOP.polymorphism;

public class Triangle extends Shape{
    int base , height ;
    Triangle(int base , int height){
        this.base = base;
        this.height = height;
    }

    double area(){
        System.out.println("Area for Triangle");
        return .5 * base * height;
    }
}

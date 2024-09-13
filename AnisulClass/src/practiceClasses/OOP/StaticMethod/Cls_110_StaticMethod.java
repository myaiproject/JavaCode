package practiceClasses.OOP.StaticMethod;

public class Cls_110_StaticMethod {

    void display1(){
        display2();
       // System.out.println("This is from non-static method.");
    }

   static void display2(){
        System.out.println("This is from static method.");
    }
}

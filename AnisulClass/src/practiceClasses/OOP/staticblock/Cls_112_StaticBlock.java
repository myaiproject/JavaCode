package practiceClasses.OOP.staticblock;

public class Cls_112_StaticBlock {

    static int id ;
    static String name ;

    static {
        id = 101;
        name = "S M Rabiul";

    }
    static  void displayInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

package practiceClasses.OOP.staticblock;

public class Cls_112_StaticBlockPriority {

    static{
        System.out.println("Static block will print before main class.");
    }

    public static void main(String[] args) {

        System.out.println("Main  will print after static block.");

    }
}

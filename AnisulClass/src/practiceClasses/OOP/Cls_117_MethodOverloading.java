package practiceClasses.OOP;

public class Cls_117_MethodOverloading {

    /*

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }

     */
//Automatic Type Conversion ,i give int value it will convert double cause there no vale of three double value
    void add(double a, double b,double c ){
        System.out.println("The output will come Automatic Type Conversion" + (a + b + c ));
    }
    void add(){
        System.out.println("Nothing to Add:");
    }
}

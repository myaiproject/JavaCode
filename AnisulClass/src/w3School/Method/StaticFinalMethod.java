package w3School.Method;

public class StaticFinalMethod {
    // static method
    static void myStaticMethod(){
        System.out.println("Static method can be called without create an object");
    }
    //public method
    public void myPublicMethod(){
        System.out.println("public method must be called by creating object");
    }

    //Main method
    public static void main(String[] args) {
        myStaticMethod();

        StaticFinalMethod myObj = new StaticFinalMethod();
        myObj.myPublicMethod();
    }
}

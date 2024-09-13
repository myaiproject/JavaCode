package w3School.Method;

public class StaticPublic {
    //static method
    static void myStaticMethod(){
        System.out.println("Static method can be called without creating object");

    }

    //public method
    public void myPublicMethod(){
        System.out.println("Public method must be called by creating object");


    }

    //main method
    public static void main(String[] args) {
        myStaticMethod();//call the static method
        //myPublicMethod();This would compile an error

        StaticPublic myObject = new StaticPublic();
        myObject.myPublicMethod();


    }
}


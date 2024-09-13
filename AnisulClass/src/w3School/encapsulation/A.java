package w3School.encapsulation;

public class A {
    public A(){
        System.out.println("Object created");

    }
    public void show(){
        System.out.println("in A show.");
    }
}

class Demo1{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }

}

package Encapsulation100code.accessModifiers.protectedMethodOverriding;

public class Parent {
    protected void displayMessage(){
        System.out.println("Message from parent class");
    }
}
class Child extends  Parent{
    protected void displayMessage(){
        System.out.println(" Overridden Message from child class");
    }
}

class Main{
    public static void main(String[] args) {
        //Parent obj = new Parent();
        Parent obj = new Child();
        obj.displayMessage();
    }
}
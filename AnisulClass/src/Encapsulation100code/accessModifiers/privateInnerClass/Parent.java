package Encapsulation100code.accessModifiers.privateInnerClass;

public class Parent {
    protected void displayMessage(){
        System.out.println("Message from parent class.");
    }
}

class Child extends  Parent{
    @Override
    protected void displayMessage() {
        System.out.println("Override Message from Child class.");
    }
}

 class Main{
     public static void main(String[] args) {
         Parent obj = new Child();
         obj.displayMessage();
     }

}

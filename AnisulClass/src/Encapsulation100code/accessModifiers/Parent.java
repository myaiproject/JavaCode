package Encapsulation100code.accessModifiers;
//Protected Members and Inheritance
public class Parent {
    protected int protectedVar = 30;

}

class Child extends Parent{
   public void showProtectedVar(){
       System.out.println("Protected variable: " + protectedVar);
   }
}

class Main3{
    public static void main(String[] args) {
        Child child = new Child();
        child.showProtectedVar();
    }

}

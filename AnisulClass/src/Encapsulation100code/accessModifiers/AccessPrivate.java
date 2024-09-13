package Encapsulation100code.accessModifiers;

//Accessing Private Members from Another Class
public class AccessPrivate {
    private  int privateVar = 20;
}
class Main2{
    public static void main(String[] args) {
        AccessPrivate accessPrivate = new AccessPrivate();
       // System.out.println("Private variable: " + accessPrivate.privateVar);//show this privateVar' has private access
    }

}

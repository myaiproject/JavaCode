package Encapsulation100code.accessModifiers;

//Accessing Public Members from Another Class
public class AccessPublic {
    public int publicVar = 10;
}

class Main1{
    public static void main(String[] args) {
        AccessPublic accessPublic = new AccessPublic();
        System.out.println("Public variable: " + accessPublic.publicVar);
    }

}

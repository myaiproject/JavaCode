package Encapsulation100code.accessModifiers;
//Using Getters and Setters with Private Members

public class AccessPrivateGetSet {
    private int privateVar = 20; // Private variable

    // Getter method
    public int getPrivateVar() {
        return privateVar;
    }

    // Setter method
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }
}

class MainGetSet{
    public static void main(String[] args) {
//        Private Variables: Use getter and setter
//        methods to provide controlled access
//    to private variables from outside the class.

        AccessPrivateGetSet accessPrivateGetSet = new AccessPrivateGetSet();

        // Access the private variable via the getter method
        System.out.println("Private variable via Getter: " + accessPrivateGetSet.getPrivateVar());

        // Modify the private variable via the setter method
        accessPrivateGetSet.setPrivateVar(30);

        // Access the modified private variable via the getter method
        System.out.println("Private variable after Setter: " + accessPrivateGetSet.getPrivateVar());// Prints 30
    }
}

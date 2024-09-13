package Encapsulation100code.accessModifiers;

public class AccessPrivateMethod {

    // Private method: Can only be accessed from within this class

    private void showMessage(){
        System.out.println("This is a private Method.");
    }
//    Private Methods: Use public methods within the same class to
//        provide indirect access to private methods.

    public void accessPrivateMethod1() {
        System.out.println("Executing accessPrivateMethod1");
    }

    // Public method: Can be accessed from outside this class and provides controlled access to the private method

    public void accessPrivateMethod(){
        showMessage();// Indirect access to the private method
    }

}

class Main5{
    public static void main(String[] args) {
        AccessPrivateMethod obj = new AccessPrivateMethod();

        // obj.showMessage(); // This will cause a compilation error because showMessage() is private

       // obj.accessPrivateMethod();// This is allowed because accessPrivateMethod() is public
        // Call methods in sequence
        obj.accessPrivateMethod1(); // This will execute first
        obj.accessPrivateMethod();  // This will execute second
    }
}

package Encapsulation100code.accessModifiers;
// Basic Understanding of Access Modifiers

public class BasicExample {
    public  int publicVar = 10;
    private int privateVar = 20;// Private variable, accessible only within this class
    protected int protectedVar = 30;
    int defaultVar = 40; //default access modifier

    public void showVariable(){
        // Accessing all variables within the same class, including private
        System.out.println("Public: " + publicVar);
        System.out.println("Private: " + privateVar); // Accessible here
        System.out.println("Protected " + protectedVar);
        System.out.println("Default: " + defaultVar);
    }
}
class Main{
    public static void main(String[] args) {

        BasicExample basicExample = new BasicExample();
        // The Main class cannot access privateVar directly, but it can call showVariable()
        basicExample.showVariable();// This method has access to privateVar
    }
    /*privateVar is private, it cannot be accessed directly from
    the Main class. However, because privateVar is accessed from
    within the showVariable() method (which is part of the BasicExample class),
    it works without any issues.*/
}

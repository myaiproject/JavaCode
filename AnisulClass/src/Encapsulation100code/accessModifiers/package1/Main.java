package Encapsulation100code.accessModifiers.package1;

import Encapsulation100code.accessModifiers.package2.Child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.showProtectedVar();

       /* The protectedVar is accessible in the Child class, even though it’s
         in a different package, because it’s inherited.*/
    }
}

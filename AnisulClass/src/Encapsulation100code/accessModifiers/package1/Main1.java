package Encapsulation100code.accessModifiers.package1;
// Accessing Protected Members from Different Packages

import Encapsulation100code.accessModifiers.package2.Child1;

public class Main1 {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.showProtectedVar();
        //The protectedVar is accessible in the Child class, even though it’s in a different package, because it’s inherited.
    }
}

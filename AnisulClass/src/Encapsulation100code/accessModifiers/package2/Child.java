package Encapsulation100code.accessModifiers.package2;

import Encapsulation100code.accessModifiers.Parent;

// Accessing Protected Members from Different Packages
public class Child extends Parent {

    public void showProtectedVar(){
        System.out.println("Protected Variable: " + protectedVar);
    }
}


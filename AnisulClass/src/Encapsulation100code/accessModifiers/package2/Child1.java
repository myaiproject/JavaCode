package Encapsulation100code.accessModifiers.package2;
// Accessing Protected Members from Different Packages

import Encapsulation100code.accessModifiers.package1.Parent1;

public class Child1 extends Parent1 {
    public void showProtectedVar(){
        System.out.println("Protected Variable: " + protectedVar);
    }
}

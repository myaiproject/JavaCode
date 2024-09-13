package Encapsulation100code.accessModifiers.package2;

import Encapsulation100code.accessModifiers.package1.AccessPublic;

//Public Modifier Across Different Packages
public class AccessPublicMain {
    public static void main(String[] args) {
        AccessPublic obj = new AccessPublic();
        System.out.println("Public variable: " + obj.publicVar+ " access from different package");
        //The publicVar is accessible across packages because it’s marked as public.
    }
}

package Encapsulation100code.accessModifiers;
//Default Access Modifier and Package-Level Access
//Default Access Modifier (Package-Private):Accessible within the same package only
//Package-Level Access:Meaning: Refers to the visibility of members (and classes) that have default access within the same package.

public class PackageLevel {
    int defaultVar = 40;// default  access  modifier may call(package-private)
}

class Main4{
    public static void main(String[] args) {
        PackageLevel obj = new PackageLevel();
        System.out.println("Default Variable: " + obj.defaultVar );
    }

}

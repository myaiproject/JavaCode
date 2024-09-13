package Encapsulation100code.accessModifiers;
// Accessing Protected Members from Unrelated Classes in Same Package
public class ParentProtectedMem {
    protected int protectedVar = 60;
}

class Main7{
    public static void main(String[] args) {

        ParentProtectedMem obj = new ParentProtectedMem();
        System.out.println("Protected Variable: " + obj.protectedVar);
    }
}

package Encapsulation100code.accessModifiers;

public class AccessPrivateConstructor {
    private AccessPrivateConstructor(){
        System.out.println("Private constructor:");
    }
    public static AccessPrivateConstructor createInstance(){
        return new AccessPrivateConstructor();
    }
}

class Main8{
    public static void main(String[] args) {
        AccessPrivateConstructor obj = AccessPrivateConstructor.createInstance();
    }
}

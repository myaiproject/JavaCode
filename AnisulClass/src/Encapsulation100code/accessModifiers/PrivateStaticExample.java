package Encapsulation100code.accessModifiers;

public class PrivateStaticExample {
    private static int privateStaticVar = 100;

    public static int  getPrivateStaticVar(){
        return privateStaticVar;
    }

    public static void setPrivateStaticVar(int value){
        privateStaticVar = value;

    }
}

class Main9{
    public static void main(String[] args) {
        System.out.println("Private static varable: " + PrivateStaticExample.getPrivateStaticVar());
        PrivateStaticExample.setPrivateStaticVar(200);
        System.out.println("Private Static Variable after update " + PrivateStaticExample.getPrivateStaticVar());
    }

}
package Encapsulation100code.accessModifiers.privateInnerClass;

public class OuterClass {
    private class InnerClass{
        void display(){
            System.out.println("Message from private inner class");
        }
    }

    public void createInnerClassInstance(){
        InnerClass inner = new InnerClass();
        inner.display();
    }
}

class Main1{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClassInstance();
    }

}

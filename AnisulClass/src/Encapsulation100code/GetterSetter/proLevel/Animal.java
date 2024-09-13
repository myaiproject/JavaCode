package Encapsulation100code.GetterSetter.proLevel;
// Encapsulation with Inheritance

public class Animal {
    private String type;

    // Protected getter for subclasses
    protected String getType(){
        return type;
    }
    protected void setType(String type){
        this.type = type;
    }

}

class Dog extends Animal{
    public Dog(){
        setType("Dog");
    }

    public void printType(){
        System.out.println("Animal type: " + getType());
    }
}
class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printType();
    }
}

package Encapsulation100code.GetterSetter.beginnerLevel;

// Basic Getters and Setters
public class Person {
    private String name;

    //Getter method for name
    public String getName(){
        return name;
    }

    //Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        System.out.println("Name: " + person.getName());
    }
}

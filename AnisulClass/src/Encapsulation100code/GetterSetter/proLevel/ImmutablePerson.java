package Encapsulation100code.GetterSetter.proLevel;

//Immutable Class

/*
Declare the Class as final: Prevent subclassing to maintain immutability.
        Use final Fields: Ensure fields are assigned only once and cannot be changed.
Initialize Fields via Constructor: Set all fields during object creation.
No Setter Methods: Avoid methods that alter the object's state.
Provide Getter Methods: Allow read-only access to the fields
*/

public final  class ImmutablePerson {
    private final String name;
    private final int age;


    public ImmutablePerson(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Getter Method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutablePerson imp = new ImmutablePerson("Rivan", 2);
        System.out.println("Name: " + imp.getName());
        System.out.println("Age: " + imp.getAge());
    }
}

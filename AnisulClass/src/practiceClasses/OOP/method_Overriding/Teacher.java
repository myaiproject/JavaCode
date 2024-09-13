package practiceClasses.OOP.method_Overriding;

public class Teacher extends Person {
    String qualification ;

    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + qualification);
    }
}

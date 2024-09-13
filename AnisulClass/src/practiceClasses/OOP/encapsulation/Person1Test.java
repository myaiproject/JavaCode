package practiceClasses.OOP.encapsulation;

public class Person1Test {
    public static void main(String[] args) {
        Person1 p1 = new Person1();
        p1.setName("Rabiul");
        p1.setAge(29);
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " +p1.getAge());
    }
}

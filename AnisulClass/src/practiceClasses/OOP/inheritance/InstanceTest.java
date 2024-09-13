package practiceClasses.OOP.inheritance;

public class InstanceTest {
    public static void main(String[] args) {
        InstanceOfOpAnimal a = new InstanceOfOpAnimal();
        InstanceOfOpPerson p = new InstanceOfOpPerson();
        InstanceOfOpTeacher t = new InstanceOfOpTeacher();

        System.out.println(a instanceof InstanceOfOpAnimal);
        System.out.println(p instanceof InstanceOfOpAnimal);
        System.out.println(t instanceof InstanceOfOpPerson);
        System.out.println(t instanceof InstanceOfOpAnimal);
        System.out.println(p instanceof InstanceOfOpTeacher);
    }
}

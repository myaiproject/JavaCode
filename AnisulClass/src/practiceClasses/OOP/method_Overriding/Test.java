package practiceClasses.OOP.method_Overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Rony";
        t1.age = 32;
        t1.qualification = "Masters in Eng";
        t1.displayInfo();

        Person p= new Person();
        p.name = "Ronyr bow";
        p.age = 16;
        //p.qualification = "Masters in Eng";
        p.displayInfo();
    }
}

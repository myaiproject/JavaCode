package practiceClasses.OOP;

public class Cls_105_ConstructorOverloadTest {
    public static void main(String[] args) {

        Cls_105_ConstructorOverloadTeacher teacher = new Cls_105_ConstructorOverloadTeacher();
        teacher.displayInfo();

        System.out.println("\n");

        Cls_105_ConstructorOverloadTeacher teacher1 = new Cls_105_ConstructorOverloadTeacher("Naru","Female");
       teacher1.displayInfo();
        System.out.println("\n");

        Cls_105_ConstructorOverloadTeacher teacher2 = new Cls_105_ConstructorOverloadTeacher("paru","Male",30);
        teacher2.displayInfo();
        System.out.println("\n");

        Cls_105_ConstructorOverloadTeacher teacher3 = new Cls_105_ConstructorOverloadTeacher("Saru","Male",20,201);
        teacher3.displayInfo();
    }
}

package practiceClasses.OOP;

public class Cls_103_ConstructorTeacherTest {
    public static void main(String[] args) {

        Cls_103_ConstructorTeacher teacher = new Cls_103_ConstructorTeacher("Naza","Male",729721030);
        teacher.displayInfo();

        System.out.println();

        Cls_103_ConstructorTeacher teacher1 = new Cls_103_ConstructorTeacher("Rony","Male",727721030);
        teacher1.displayInfo();

        System.out.println();

        Cls_103_ConstructorTeacher teacher2 = new Cls_103_ConstructorTeacher();
        teacher2.displayInfo();

    }
}

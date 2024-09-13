package practiceClasses.OOP;

public class Cls_100_TeacherTest {
    public static void main(String[] args) {

        Cls_100_Teacher teacher = new Cls_100_Teacher();

        //teacher.name = "Nazrul";
       // teacher.gender = "Male";
       // teacher.phone = 1720596970;

        teacher.setInfo("Nazrul islam","Male",1720596970);
        teacher.displayInfo();

        Cls_100_Teacher teacher1 = new Cls_100_Teacher();
        //teacher1.name = "Rony";
       // teacher1.gender = "Male";
       // teacher1.phone = 1729721030;
        teacher1.setInfo("Rony","Male",1729721030);
        teacher1.displayInfo();

        System.out.println("\n");


        Cls_100_Teacher teacher2 = new Cls_100_Teacher();
       // teacher2.name = "Nime";
        //teacher2.gender = "Male";
       // teacher2.phone = 1720996970;
        teacher2.setInfo("Nime","Male",1720996970);
        teacher2.displayInfo();

    }

}

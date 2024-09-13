package practiceClasses.OOP.inheritance;

public class Teacher1 extends Person1{
    //extend korarfole person class er name age ,method sob ay class a ashegace
    String qualification;

    void displayInfo2(){
        displayInfo1();
        System.out.println("Qualification: " + qualification);
    }
}

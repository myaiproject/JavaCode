package practiceClasses.OOP.finalKeyword;

public class University {
   final String UVNAME = "BU" ;
   final int fees ; //blank final variable
   static final int student ;// static blank final variable
static {
    // static blank final variable assign by static block
    student = 500;
}

    University(){
        // blank final variable assign by constructor
        fees = 67890;
    }


    void displayInFo(){

        System.out.println("Name: "+UVNAME);
        System.out.println("Age: "+fees);
        System.out.println("Student: "+student);
    }
}

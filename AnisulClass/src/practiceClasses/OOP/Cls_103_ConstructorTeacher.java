package practiceClasses.OOP;

public class Cls_103_ConstructorTeacher {
    // Attributes of the Teacher class
    String name ,gender ;
    int phone;

//default constructor
    Cls_103_ConstructorTeacher(){
        System.out.println("No value.");
    }

    //parameterised  constructor
    Cls_103_ConstructorTeacher(String n,String g,int ph){
        name = n;
        gender = g;
        phone = ph;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Phone: "+phone);
    }
}

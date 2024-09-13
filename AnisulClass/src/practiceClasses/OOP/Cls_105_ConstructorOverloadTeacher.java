package practiceClasses.OOP;

public class Cls_105_ConstructorOverloadTeacher {
    // Attributes of the Teacher class
    String name , gender;
    int age,id;

    // A constructor in Java is a special method that is used to initialize objects

    //Default constructor
    Cls_105_ConstructorOverloadTeacher(){

        System.out.println("No information:");
    }

    //parameterised constructor
    Cls_105_ConstructorOverloadTeacher(String n,String g){
        name = n;
        gender = g;

    }

    //parameterised constructor
    Cls_105_ConstructorOverloadTeacher(String n,String g,int a){
        name = n;
        gender = g;
        age = a;


    }

    //parameterised constructor
    Cls_105_ConstructorOverloadTeacher(String n,String g,int a,int Id){
        name = n;
        gender = g;
        age = a;
        id = Id;


    }
    void displayInfo(){

        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("ID: "+id);



    }



}

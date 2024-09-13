package practiceClasses.OOP.Thiskeyword;

public class Student {
    String name ;
    int age;
    static String uVName = "BU";
    String hairColour;

    Student(String name , int age ){
        this.name = name ;
        this . age = age ;
    }

    Student(String name , int age , String hairColour){

       this(name,age);
        this.hairColour = hairColour ;
    }

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("University Name : " + uVName);
        System.out.println("Hair Colour : " + hairColour);
    }
}

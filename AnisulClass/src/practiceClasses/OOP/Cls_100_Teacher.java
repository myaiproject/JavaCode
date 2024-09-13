package practiceClasses.OOP;

public class Cls_100_Teacher {

    // Attributes of the Teacher class

    String name , gender;
    int phone;

    void setInfo(String n , String g, int ph){
        name = n ;
        gender = g;
        phone = ph;

    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender:"+gender);
        System.out.println("Phone:"+phone);
        System.out.println();
    }
}

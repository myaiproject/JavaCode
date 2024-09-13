package practiceClasses.OOP.StaticKeyWord;

public class Cls_107_StaticPart1Student {
    String name ;
    int id ;
   static String uniVName = "Bangladesh University";

    Cls_107_StaticPart1Student(String n, int ID){
        name = n ;
          id = ID;
       // uniVName = uV;

    }
    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University Name: " + uniVName);
    }

}

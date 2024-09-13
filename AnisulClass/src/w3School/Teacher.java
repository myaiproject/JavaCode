package w3School;

public class Teacher {
    String name, gender;
    int ID;
   static String uvName = "Bu";

    Teacher(String name,String gender, int ID){
        this.name = name;
        this.gender = gender;
        this .ID = ID;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("ID: "+ID);
        System.out.println("UvName: "+Teacher.uvName);

    }
    static void displayInfo2(){
        System.out.println("from static method");

    }




}


class Test{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Nazrul","Male",101);
        t1.displayInfo();

        Teacher t2 = new Teacher("Mitul","Fimale",102);
        t2.displayInfo();

        Teacher t3 = new Teacher("Rony","Male",103);
        t3.displayInfo();
    }


}





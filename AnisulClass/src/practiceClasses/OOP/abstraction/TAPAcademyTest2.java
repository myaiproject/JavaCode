package practiceClasses.OOP.abstraction;

 public class TAPAcademyTest2 {
     void fun(){
        System.out.println("I am fro parent class");
    }
}

 class TAPAcademyTest3 extends TAPAcademyTest2 {
     void fun(){
         System.out.println("I am fro child class overridden method");
     }

}
class Demo2{
    public static void main(String[] args) {
        TAPAcademyTest3 t3 = new TAPAcademyTest3();
        t3.fun();


    }
}

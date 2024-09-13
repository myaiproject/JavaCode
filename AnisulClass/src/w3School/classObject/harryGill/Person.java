package w3School.classObject.harryGill;

public class Person {
   //properties
   String name;

   //Behaviour
    public void sayYourName(){
        System.out.println("My name is " + name);
    }
}

class Main{
    //entry point of the programme
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.sayYourName();

        Person p1 = new Person();
        p1.name = "Lucy";

        Person p2 = new Person();

        Person p3 = p;
        Person p4 = p3;
        Person p5 = p2;

        p = null;
        p1 = null;
        p2 = null;



    }
}

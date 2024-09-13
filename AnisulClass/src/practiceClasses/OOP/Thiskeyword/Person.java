package practiceClasses.OOP.Thiskeyword;

public class Person {

    void  message(){
        System.out.println("I am message method.");
    }

    void  display(){
        message();
        System.out.println("I am display method.");
    }
}

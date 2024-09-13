package practiceClasses.OOP.superKeyword;

public class A1 {

    void display(){
        System.out.println("I have overridden method in the child class B1 and i am from Inside A1 class so use super keyword to call me.");
    }

    void message(){
        System.out.println("I am not overridden from Inside A1 class so no need super keyword to call me. ");
    }

}

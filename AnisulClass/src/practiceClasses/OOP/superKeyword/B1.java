package practiceClasses.OOP.superKeyword;

public class B1 extends A1{
    //display method akhane inherite hoa gase

    @Override
    void display() {
        super.display();
        message();
        System.out.println("This is overridden method inside B1 Class.");
    }
}

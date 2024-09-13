package practiceClasses.OOP.abstraction;

public class Test {
    public static void main(String[] args) {
        //can't make object an abstract class
        //'MobileUser' is abstract; cannot be instantiated
       // MobileUser m = new MobileUser() ;
        MobileUser mobileUser ; //Reference variable

        mobileUser = new Rahim();
        mobileUser.call();
        mobileUser.sendMessage();

        mobileUser = new Karim();
        mobileUser.sendMessage();
    }
}

package practiceClasses.OOP.abstraction.interfacE;

 public interface  A {
void play();
}
 interface  B {
     void play();

}
class C implements A , B{
    @Override
    public void play() {
        System.out.println("I'm from C Class");
    }
}
class ABCTest{
    public static void main(String[] args) {
        //create a reference variable of class B
        A a ;
        a = new C();
        a.play();
        //create a reference variable of class B
        B b;
        b = new C(); // Assign an instance of C, which implements B
        b.play();
        //create an object of class C
        C c = new C();
        c.play();
    }
}

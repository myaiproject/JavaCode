package practiceClasses.OOP.abstraction;
//QUESTION: Can an abstract class contain only concrete method???
//answer is yes but 90% says no
 abstract class TAPAcademyTest1 {


    void fun1() {
        System.out.println("Inside fun1");
    }

    void fun2() {
        System.out.println("Inside fun2");
    }
}
class TAPAcademyTest1Impl extends TAPAcademyTest1 {
    // This class inherits all methods from TAPAcademyTest1
}

 class Demo1{
    public static void main(String[] args) {
        
        TAPAcademyTest1 t;
        // We instantiate the subclass, not the abstract class itself
        t = new TAPAcademyTest1Impl();

        t.fun1();
        t.fun2();

    }
}

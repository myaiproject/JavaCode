package practiceClasses.OOP.FinalMethodClass;

public class  Students extends  University{
    //can't extend final class like  university
    // display() method already present
    // final method can inherit but can not be override
    void display2(){
        System.out.println("Student info.");
    }
}

package practiceClasses.Loop;

public class Cls_120_CallByReferenceTest {
    public static void main(String[] args) {

        Cls_120_CallByReference r1 = new Cls_120_CallByReference();
        r1.name = "Anu";
        System.out.println("Before calling:"+ r1.name);

        r1.change(r1);
        System.out.println("After calling:"+ r1.name);
    }
}

package practiceClasses.Loop;

public class Cls_120_CallByValueTest {
    public static void main(String[] args) {

        Cls_120_CallByValue ob = new Cls_120_CallByValue();
        int x = 10 ;
        System.out.println("X before call " + x);

        ob.chane(x);
        System.out.println("X after call " + x);

    }
}

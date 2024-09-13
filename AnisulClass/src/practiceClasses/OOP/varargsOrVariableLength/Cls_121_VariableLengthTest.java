package practiceClasses.OOP.varargsOrVariableLength;

public class Cls_121_VariableLengthTest {
    public static void main(String[] args) {
        Cls_121_VariableLength ob = new Cls_121_VariableLength();
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10 , 20,30 , 40);
        ob.add(10 , 20 , 30 , 40 , 50);
        ob.add(10.1 , 20.2 , 30.3 , 40.4, 50.5);

    }

}

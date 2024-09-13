package practiceClasses;

public class Cls_13_BitwiseOperator {
    public static void main(String[] args) {

        int num1 = 32, num2 = 12 , result ;

        result = num1 & num2 ;
        System.out.println("BitwiseAND =" + result);

        result = num1 | num2 ;
        System.out.println("BitwiseOR= " + result);

        result = num1 ^ num2 ;
        System.out.println("BitwiseXOR= " + result);
    }
}

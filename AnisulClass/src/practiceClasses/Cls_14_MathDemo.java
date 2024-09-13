package practiceClasses;

public class Cls_14_MathDemo {
    public static void main(String[] args) {
        int x = 2 , y = 4 ;
        System.out.println("Max = " + Math.max(x,y));
        System.out.println("Min = " + Math.min(x,y));

        int absolute = Math.abs(y);
        System.out.println("Absolute value = " + absolute);

        double power = Math.pow(x,y);
        System.out.println(x +" to the power " + y + " = "+power);

        int round = Math.round(8.50f);
        System.out.println("round = " + round);

        double pi = Math.PI;
        System.out.println("Pi = "+pi);
    }
}

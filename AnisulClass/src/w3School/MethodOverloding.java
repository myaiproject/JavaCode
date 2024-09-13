package w3School;

public class MethodOverloding {

    static int plusMethodInt(int x , int y){
        return x + y ;
    }

    static double plusMethodDouble(double x , double y){
        return x + y ;
    }

    public static void main(String[] args) {
        int numInt = plusMethodInt(8 , 5);
        double numDouble = plusMethodDouble(4.3 , 6.26);

        System.out.println( "intNum addition: " +numInt);
        System.out.println( "doubleNum addition: " +numDouble);
    }
}

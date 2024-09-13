package practiceClasses;

public class Cls_141_ExceptionHandling1 {
    public static void main(String[] args) {
        try {
            int x = 10 , y = 0 , result;
            result = x / y ;
           // System.out.println("Result = " + result);

        }
        catch (ArrayIndexOutOfBoundsException e1){
           // System.out.println("Exception : "+e1);
        }
        catch (ArithmeticException e2){
            System.out.println(e2.getMessage());
        }
        finally {
            System.out.println("Last line of the code" );

        }


    }
}

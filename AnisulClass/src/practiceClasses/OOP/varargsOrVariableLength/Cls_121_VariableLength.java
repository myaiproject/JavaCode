package practiceClasses.OOP.varargsOrVariableLength;

public class Cls_121_VariableLength {
    /*

    void add(int num1 , int num2){
        System.out.println(num1 + num2);
    }

    void add(int num1 , int num2,int num3){
        System.out.println(num1 + num2 + num3);
    }

     */
    //uporer gula bad
    void add(int ... num){
        int sum = 0;
        for (int x : num){

            sum = sum + x;

        }
        System.out.println("sum = "+ sum);
    }

    void add(double ... num){
        double sum = 0;
        for (double x : num){

            sum = sum + x;

        }
        System.out.println("sum = "+ sum);
    }
}

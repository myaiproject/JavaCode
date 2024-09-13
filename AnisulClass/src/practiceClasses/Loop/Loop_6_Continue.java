
package practiceClasses.Loop;

public class Loop_6_Continue {
    public static void main(String[] args) {

        for (int  i = 1 ; i <= 100 ; i++){
            if(i == 10){
                continue;// akhan theke again loop er increment or decrement a jabe
            }
            System.out.println(i);

        }
    }
}


package recursion;

public class Recursion_1_Practice {
   static int fun(int n){
        if (n == 0){
            return 1;
        }
        else {
            return 7 + fun(n - 2);

        }
    }

    public static void main(String[] args) {
        System.out.println(fun(4));

    }

    /*
    fun(0) return = 1 and fun (2) return  = 7+fun(0)= 7 + 1 = 8
    and fun(4) = 7 + fun(2) return 8 so 7 + 8 = 15
     you can replace each fun() in the other equation and you will find it .

fun(4) = 7 + 7 + 1 = 15
     */
}

package NesoAcd;

public class VariableRange {
    public static void main(String[] args) {

        int i1 = 5;
        int iMax = 2147483647;
//        int iMaxOver = 2147483648;//produce an error
        int iMin = -2147483648;
//        int iMinOver= -2147483649;//produce an error
        System.out.println("Maximum Range of integer positive integer number: "+ iMax);
        System.out.println("Maximum Range of integer Negative integer number: "+ iMin );

        byte bMax = 127;
        byte bMin = -128;
        System.out.println("Maximum Range of Byte positive number: "+ bMax);
        System.out.println("Maximum Range of Byte Negative number: "+ bMin );

        short sMax = 32767;
        short sMin = -32768;
        System.out.println("Maximum Range of Short positive number: "+ sMax);
        System.out.println("Maximum Range of Short Negative number: "+ sMin );

//        short sMax = 32767;
//        short sMin = -32768;
//        System.out.println("Maximum Range of Short positive number: "+ sMax);
//        System.out.println("Maximum Range of Short Negative number: "+ sMin );



    }
}

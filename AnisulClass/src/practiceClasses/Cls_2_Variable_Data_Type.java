package practiceClasses;

public class Cls_2_Variable_Data_Type {
    public static void main(String[] args) {

        //style of declaration & assign variable

        int x ; // This is only declaration
        x = 5 ; // This is assign of value
        int p = 5 ; // // This is dynamic declaration

        // primitive 8 data types examples

        // Integer data type example

        byte myByte = 100 ; //8 bit integer range -128 to 127
        System.out.println("Byte value = " + myByte);

        int myInt = 1000000 ; // 32 bit int range -2^31 to (2^31) - 1)
        System.out.println("Integer value = " + myInt);

        short myShort = 20000 ; //16 bit integer range -32768 to 32767
        System.out.println("Short value = " + myShort);

        long myLong = 10000000000L ;// 'L' suffix to indicate a long literal //64-bit integer range -2^63 to (2^63) - 1
        System.out.println("Long value = " + myLong);

        // floating point data type example

        float myFloat = 3.14159f ;
        System.out.println("Float value = " + myFloat);

        double myDouble = 3.123234354675980696655443 ;
        System.out.println("Double value = " + myDouble);


        boolean isJavaFun = true ;
        boolean isProgrammingHard = false ;// can keep either true  or false

        System.out.println("Is Java Fun? " + isJavaFun);
        System.out.println("Is Programming Hard? " + isProgrammingHard);

        char myChar = 'a';
        System.out.println("Character value: " + myChar);

        // above example without format specifier
        // example with format specifier given bellow
        System.out.println("\n");

        System.out.printf("Byte value = %d \n" , myByte);
        System.out.printf("Short value = %d" , myShort);
        System.out.printf("Integer value = %d \n" , myInt);
        System.out.printf("Long value = %d \n" , myLong);
        System.out.printf("Double value = %f" , myDouble);
        System.out.printf("Float value = %f \n" , myFloat);
        System.out.printf("Is Java Fun? %b \n" , isJavaFun);
        System.out.printf("Is Programming Hard? %b \n" , isProgrammingHard);
        System.out.printf("Character value: %c" , myChar);



    }
}

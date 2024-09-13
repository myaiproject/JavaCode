package w3School.classObject.harryGill;

public class Main1 {
    public static void main(String[] args) {
        Person1 person1= new Person1();
        int i = 10;
        String logMsg = " is driving a car at a speed of ";
        System.out.println(person1.fName + logMsg + i);

        int[] a = {20,50,60};//just random local array of ints
        person1.drive();
    }
}

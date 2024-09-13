package w3School.Constructor;

public class Main1 {
    int x; //Create a class attribute

    //
    public Main1(){
        x = 5;
    }

    public static void main(String[] args) {
        Main1 myObj = new Main1();
        System.out.println(myObj.x);
    }
}

package w3School.Constructor;

public class Main2 {
    int x;
    public Main2(int y){
        x = y;
    }

    public static void main(String[] args) {
        Main2 myObj = new Main2(5);
        System.out.println(myObj.x);
    }
}
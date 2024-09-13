package w3School.classObject;

public class MultipleClass {
    int x = 5;
}

class Second{
    public static void main(String[] args) {
        MultipleClass myobj1 = new MultipleClass();
        MultipleClass myobj2 = new MultipleClass();

        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
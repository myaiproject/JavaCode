package w3School.classObject;

public class MultipleObject {
    int x = 5;

    public static void main(String[] args) {
        MultipleObject myObject1 = new MultipleObject();
        MultipleObject myObject2 = new MultipleObject();
        myObject2.x = 25;
        System.out.println(myObject1.x);
        System.out.println(myObject2.x);
    }
}

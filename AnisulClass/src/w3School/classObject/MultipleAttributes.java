package w3School.classObject;

public class MultipleAttributes {
    String fName = "John";
    String lName = "Doe";
    int age = 24;

    public static void main(String[] args) {
        MultipleAttributes myObj = new MultipleAttributes();
        System.out.println(myObj.fName +" "+myObj.lName +" is "+ myObj.age +" years older");
    }
}
package w3School.Method.Abstract;

import w3School.Constructor.Main3;

abstract class Main {
    public String fName = "John";
    public int age = 24;
    public abstract void study();//abstract method

}

//Subclass (inherit from main)
class Student extends Main{
    public int graduationYear = 2018;

    @Override
    public void study() {
        System.out.println("Studying all day long");
    }


}

//End code from filename :Main .java
//code from file name :Second.java

class Second{
    public static void main(String[] args) {
        // create an object of the sudent class (which inherits attributes and methods
        Student myObj = new Student();

        System.out.println("Name: " + myObj .fName);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: "+ myObj.graduationYear);
        myObj.study();
    }
}
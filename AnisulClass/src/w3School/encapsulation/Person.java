package w3School.encapsulation;

public class Person {
    private  String name;
    private  int age;

    //constructor
    Person(String name , int age){
        this.name = name ;
        this.age = age ;

    }
    //getter method
    public  String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
class  Student extends Person{
    private  int rollNo;
    private int marks;

    //constructor
    public Student(String name,int age,int rollNo,int marks){
        super(name,age);// parent class constructor
        this.rollNo = rollNo;
        this.marks = marks;

    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }
}

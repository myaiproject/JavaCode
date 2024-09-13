package Encapsulation100code.GetterSetter.intermediateLevel;

public class Employee {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero");
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setAge(25);
        System.out.println("Age: " + emp.getAge());
        emp.setAge(-5);//invalid age
    }

}

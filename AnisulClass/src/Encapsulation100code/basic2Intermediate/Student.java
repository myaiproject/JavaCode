package Encapsulation100code.basic2Intermediate;
// Encapsulation with Validation

public class Student {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName(){
        return name;
    }

    public void setName(String name){
      this.name = name;
    }

    //Getter and Setter for age width validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 0){
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
        }
    }

}

 class Main1{
     public static void main(String[] args) {
         Student student = new Student();
         student.setName("Alice");
         student.setAge(20);
         System.out.println("Student Name: " + student.getName());
         System.out.println("Student Age: " + student.getAge());

         student.setAge(-5);//Invalid age
     }

}

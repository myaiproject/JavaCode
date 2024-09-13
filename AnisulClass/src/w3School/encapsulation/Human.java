package w3School.encapsulation;

public class Human {
   private String name ;
   private int age  ;

   public Human(){
       age = 20;
       name = "Rivan";
   }

    public Human(String name){

        this.name = name;
    }

    public Human(int age,String name){
     this.age = age;
     this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 class Demo{
     public static void main(String[] args) {
         Human obj = new Human();
         Human obj1 = new Human(111,"rony");
         Human obj2 = new Human("rony vi");

         System.out.println("Name: "+ obj.getName());
         System.out.println("Age: "+ obj.getAge());

         System.out.println("Name: "+ obj1.getName());
         System.out.println("Age: "+ obj1.getAge());

         System.out.println("Name: "+ obj2.getName());
//
         obj.setAge(11);
         obj.setName("Navin");

         System.out.println("Name: "+ obj.getName());
         System.out.println("Age: "+ obj.getAge());

     }

}

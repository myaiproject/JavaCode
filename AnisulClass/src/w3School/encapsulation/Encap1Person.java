package w3School.encapsulation;

public class Encap1Person {
  private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

 class Main{
     public static void main(String[] args) {
         Encap1Person myObj = new Encap1Person();
         myObj.setName("John Doe");
         System.out.println(myObj.getName());

     }

}

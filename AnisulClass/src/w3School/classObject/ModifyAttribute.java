package w3School.classObject;

public class ModifyAttribute {
    int x = 20;
   final int y = 10;

    public static void main(String[] args) {
         ModifyAttribute myObj = new ModifyAttribute();


        System.out.println(myObj.x = 41);
        System.out.println(myObj.y);//Cannot assign a value to final variable 'y'
    }

}



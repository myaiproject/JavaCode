package practiceClasses;

import java.util.Scanner;

public class Cls_3_Input_From_User {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number ;
        System.out.print("Enter any integer number: ");
        number = input.nextInt();
        System.out.println("Given number is: " + number);

        //String name = "Rabiul islam";
        //System.out.println(name);

        String userName ;
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your name:");
        //userName = inputName.next(); // cant accept after space part
        userName = inputName.nextLine();
        System.out.println("Given name is:" + userName);


}
}
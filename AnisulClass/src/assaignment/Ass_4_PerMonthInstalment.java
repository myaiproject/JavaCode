package assaignment;

import java.util.Scanner;

public class Ass_4_PerMonthInstalment {
    public static void main(String[] args) {


       final int Phone_Price = 1800;
        double instalmentPerMonth ;
        int numberOfInstallments ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number Of Installments = ");
        numberOfInstallments = scanner.nextInt();

        if (numberOfInstallments <= 0){
            System.out.println("Invalid number of installments.Please enter a positive integer.");
            return;
        }

        System.out.println("Number Of Instalment: "+numberOfInstallments);

        instalmentPerMonth = (double) Phone_Price /numberOfInstallments ;
        //System.out.println("Instalment Per-month= " + 1800/numberOfInstalment + " euros");
        System.out.println("Instalment Per-month= "+ instalmentPerMonth + " euros");

        scanner.close();


    }
}

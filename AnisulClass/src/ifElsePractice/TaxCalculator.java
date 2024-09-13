package ifElsePractice;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        double annualIncome , taxAmount ;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your annul income: ");

        annualIncome = scanner.nextDouble();



        if (annualIncome >=0 && annualIncome <= 10000){
            System.out.println("Tax amount 0%");
        }
        else  if (annualIncome >=10001 && annualIncome <= 20000){
            taxAmount = (10 * annualIncome) / 100 ;
                    System.out.println("10% of "+ annualIncome +" =" + taxAmount + " Taka" );
        }
        else  if (annualIncome >=20001 && annualIncome <= 50000){
            taxAmount = (20 * annualIncome) / 100 ;
            System.out.println("20% of "+ annualIncome +" =" + taxAmount + " Taka" );
        }
        else  {
            taxAmount = (30 * annualIncome) / 100 ;
            System.out.println("30% of "+ annualIncome +" =" + taxAmount + " Taka" );
        }


    }
}

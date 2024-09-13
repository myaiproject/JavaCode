package ifElsePractice;

import java.util.Scanner;

public class BdTaxCalculator {
    public static void main(String[] args) {
        double annalSalary , taxFreeIncome , taxAbleIncome,taxAmount ;

        System.out.print("Enter your annalSalary:");
        Scanner scanner = new Scanner(System.in);

        annalSalary = scanner.nextDouble();
        taxFreeIncome = annalSalary / 3 ;
        taxAbleIncome = annalSalary - taxFreeIncome ;

        if (taxAbleIncome <= 350000){
            //0% tax
            taxAmount = 0 ;

        }
        else if (taxAbleIncome <= 400000){
            //5% tax
            taxAmount = 0 + .05 * (taxAbleIncome - 350000) ;

        }
        else if (taxAbleIncome <= 475000){
            //10% tax
            taxAmount = 0 + 5000 + .1 * (taxAbleIncome - 350000) ;

        }
        else if (taxAbleIncome <= 500000){
            //15% tax
            taxAmount = 0 + 5000 + 30000 + .15 * (taxAbleIncome - 475000) ;

        }
        else {
            // 20% tax
            taxAmount = 0 + 5000 + 30000 + 60000 + 0.2 * (taxAbleIncome - 500000);
        }

        System.out.println("Tax amount: " + taxAmount);



    }
}

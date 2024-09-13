        package ifElsePractice;

        import java.util.Scanner;

        public class GradeCalculator {
        public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number:");
        number = scanner.nextInt();


                if (number >= 90 && number<=100 ) {
                        System.out.println("Your grade is A");
                } else if (number >= 80 && number <= 89) {
                        System.out.println("Your grade is B");
                } else if (number >= 70 && number <= 79) {
                        System.out.println("Your grade is C");
                } else if (number >= 60 && number <= 69) {
                        System.out.println("Your grade is D");
                } else if (number >= 0 && number <= 59) {
                        System.out.println("Your grade is F");
                } else {
                        System.out.println("Invalid output:");
                }



        }
        }

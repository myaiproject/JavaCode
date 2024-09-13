package w3School.whileLoop;

public class WhileLoop3 {
    public static void main(String[] args) {
        int dice = 1 ;
        while (dice <= 6){
            if (dice < 6){
                System.out.println("NoYatzy");
            }
            else {
                System.out.println("YatZy!");
            }
            dice = dice + 1;

        }
    }
}

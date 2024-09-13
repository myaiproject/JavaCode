package practiceClasses.Loop;

public class Loop_8_ContinueQuiz3 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i = i + 3){
            if (i == 10){
                continue;
            }
            else if (i > 13){
                break;
            }
            System.out.println(i);
        }
    }
}

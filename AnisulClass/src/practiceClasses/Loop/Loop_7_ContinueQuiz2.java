package practiceClasses.Loop;

public class Loop_7_ContinueQuiz2 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100 ; i = i + 3){
            if (i == 10){
                continue;
            }
            System.out.println(i);
        }
    }
}

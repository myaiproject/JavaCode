package practiceClasses.OOP.hanoiProblem;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n , char sorc , char aux , char dest){

        if (n == 1){
            System.out.println(sorc + " -> "+ dest);
            return;
        }
        towerOfHanoi(n - 1, sorc ,dest, aux );
        towerOfHanoi(1 , sorc ,aux,dest );
        towerOfHanoi(n - 1,  aux, sorc ,dest);

    }

    public static void main(String[] args) {
        towerOfHanoi(4,'A','B','C');
    }


}

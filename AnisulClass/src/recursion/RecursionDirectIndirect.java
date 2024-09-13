package recursion;

public class RecursionDirectIndirect {
    public static void main(String[] args) {
        RecursionDirectIndirect obj = new RecursionDirectIndirect();
        obj.even(); // Start with printing even numbers
    }

    int n = 2; // Start with an even number

    void even() {
        if (n <= 10) {
            System.out.println(n);
            odd();
        }
    }

    void odd() {
        n--;
        if (n >= 1) {
            System.out.println(n);
            even();
        }
       // atay expected op ashena
    }
}
package w3School.Method;

public class MultipleAccess1 {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is"+maxSpeed);
    }

    public static void main(String[] args) {
        MultipleAccess1 myObj = new MultipleAccess1();
        myObj.fullThrottle();
        myObj.speed(200);
    }
}

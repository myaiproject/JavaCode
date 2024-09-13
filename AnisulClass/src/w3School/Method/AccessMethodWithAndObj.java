package w3School.Method;

public class AccessMethodWithAndObj {

//create a fullThrottle() method
    public void fullThrottle(){
        System.out.println("The car is going as fast it can!");
    }

    //create a speed() method and add a parameter
    public void speed(int maxSpeed){
        System.out.println("Max speed is: "+maxSpeed);
    }

    //inside main,call the methods on the myCar object
    public static void main(String[] args) {
        AccessMethodWithAndObj myCar = new AccessMethodWithAndObj();//create a myCar object
        myCar.fullThrottle();// call the fullThrottle
        myCar.speed(200);//call the speed() method
    }

}
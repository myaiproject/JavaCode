package practiceClasses.OOP.superKeyword;

public class Car extends Vehicle{
    // color ,weight ,attribute method are present here
    int gear;

    Car(String color ,double weight , int gear){
        super(color, weight);//calling constructor from vehicle class
        this.gear = gear ;
    }

    @Override
    void attribute() {
       super.attribute();
        System.out.println("Gear: " + gear);
    }
}

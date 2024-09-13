package Encapsulation100code.basic2Intermediate;
// Encapsulation with Read-Only Property

public class Car {
    private String model;
    private final String MANUFACTURER;

    //constructor to initialise MANUFACTURE
    public Car(String model , String MANUFACTURER){
        this.model = model;
        this.MANUFACTURER = MANUFACTURER;

    }

    // Getter for model
    public String getModel(){
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for manufacturer (read-only)
    public String getMANUFACTURER(){
        return MANUFACTURER;
    }


}

class Main2{
    public static void main(String[] args) {
        Car car = new Car("Model S","Tesla");
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Manufacturer: " + car.getMANUFACTURER());

        car.setModel("Model x");

        System.out.println("Updated car model: " + car.getModel());


    }

}

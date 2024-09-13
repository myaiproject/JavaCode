package w3School.Constructor;

public class Main3 {
    int modelYear;
    String modelName;

    public Main3(int modelYear , String modelName){
        this.modelName =modelName;
        this.modelYear = modelYear;
    }

    public static void main(String[] args) {
        Main3 myCar = new Main3(1969,"Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
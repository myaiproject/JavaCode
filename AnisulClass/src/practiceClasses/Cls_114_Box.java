package practiceClasses;

public class Cls_114_Box {
    // attribute (fields),instance variable
    double length ,width ,height;
/*
    // Constructor with local variables l, w, h
    Cls_114_Box(double l , double w , double h){

        length = l ;
        width = w ;
        height = h ;

    }

 */
    Cls_114_Box(double length , double width , double height){
       // use this for Instance Variable Hiding
       this.length = length ;
        this.width = width ;
        this.height = height ;

    }
    // Method to display the volume of the box
    void displayVol(){

        // Calculating and displaying volume using instance variables

        System.out.println("Volume of Box1 = " + (length * width * height));

    }
    void displayVol1(){
        // Calculating and displaying volume using instance variables
        System.out.println("Volume of Box2 = " + length * width * height);
    }


}

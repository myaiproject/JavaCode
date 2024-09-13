package practiceClasses.OOP.polymorphism;

public class RectangleTriangleShapeTest {
    public static void main(String[] args) {
/*
        Shape s = new Shape();
        Triangle t = new Triangle(10,20);
        Rectangle r = new Rectangle(10 ,20);

        System.out.println(s.area());
        System.out.println(t.area());
        System.out.println(r.area());

 */
        //Run time Polymorphism / dynamic class dispass/
        Shape[] s = new Shape[3] ;
        s[0] = new Shape();
        s[1] = new Triangle(10,20);
        s[2] = new Rectangle(10 ,20);
/*
//can print using loop
        System.out.println(s[0].area());
        System.out.println(s[1].area());
        System.out.println(s[2].area());

 */

        for (int i = 0 ; i < 3; i++){
            System.out.println(s[i].area());

        }
    }
}

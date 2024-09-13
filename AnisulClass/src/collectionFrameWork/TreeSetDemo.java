package collectionFrameWork;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet t = new TreeSet();//print natural sorting  order

//        t.add("A");//A ASCII is 65
//        t.add("a");//a ASCII is 97
//        t.add("B");
//        t.add("Z");
//        t.add("L");

       // t.add(Integer.valueOf(10));//ClassCastException( CCE) so don't allow heteroginious
        t.add(null);//NullPointerException (NPE)
        t.add("A");

        System.out.println(t);
    }
}

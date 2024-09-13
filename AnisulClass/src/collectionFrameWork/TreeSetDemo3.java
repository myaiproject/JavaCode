package collectionFrameWork;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}

class MyComparator implements Comparator{
    public  int compare(Object obj1,Object obj2) {
        Integer I1 = (Integer)obj1;
        Integer I2 = (Integer)obj2;

       /* if (I1 < I2)
            return +1;
        else if (I1 > I2)
            return -1;

        else
            return 0;*/
       // return I1.compareTo(I2);//Ascending order
      //  return -I1.compareTo(I2);//Descending Order
        //return I2.compareTo(I1);//Descending Order
       // return -I2.compareTo(I1);//Ascending Order
        //return +1;//as it is of input
       // return -1;//reverse of input but as it is
        return 0;



    }
}

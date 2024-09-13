package collectionFrameWork;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo10 {
    public static void main(String[] args) {

        TreeSet t = new TreeSet( new MyComparator2());//here is pb.with and without new MyComparator2() both time op is come same

        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("K"));
        t.add(new StringBuffer("L"));
        System.out.println(t);

    }
}

class MyComparator2 implements Comparator{
    @Override
    public int compare(Object obj1, Object obj2) {
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s1.compareTo(s2);
    }
}

package collectionFrameWork;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
       LinkedHashSet h = new LinkedHashSet();
        h.add("B");
        h.add("c");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));//false
        System.out.println(h);//[
    }
}

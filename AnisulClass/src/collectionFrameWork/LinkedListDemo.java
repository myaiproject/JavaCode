package collectionFrameWork;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();
        l.add("Rabiul");
        l.add(30);
        l.add(null);
        l.set(0,"Software");
        l.add(0,"venky");
        l.removeLast();
        l.addFirst("CCC");
        System.out.println(l);
    }
}

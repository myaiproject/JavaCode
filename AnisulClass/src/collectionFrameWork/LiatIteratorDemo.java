package collectionFrameWork;

import java.util.LinkedList;
import java.util.ListIterator;

public class LiatIteratorDemo {
    public static void main(String[] args) {

        LinkedList l = new LinkedList();

        l.add("balaAlhamdulillah");
        l.add("chiru");
        l.add("venky");
        l.add("nag");

        System.out.println(l);
        ListIterator itr = l.listIterator();

        while (itr.hasNext()){
            String s = (String) itr.next();

            if (s.equals("venky")){
                itr.remove();
            } else if (s.equals("nag")) {
                itr.add("chaitu");
            }

            else if (s.equals("chiru")) {
                itr.set("charan");
            }
        }
        System.out.println(l);
    }
}
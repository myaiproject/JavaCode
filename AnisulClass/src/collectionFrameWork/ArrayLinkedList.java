package collectionFrameWork;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayLinkedList {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        LinkedList l = new LinkedList();

        System.out.println(a instanceof Serializable);//true
        System.out.println(l instanceof Cloneable);//true
        System.out.println(a instanceof RandomAccess);//true
        System.out.println(l instanceof RandomAccess);//False
    }
}

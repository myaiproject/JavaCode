package collectionFrameWork;

public class TreeSetCompare {
    public static void main(String[] args) {

        //value r not importan sign are important
        System.out.println("A".compareTo("Z"));//-ve
        System.out.println("Z".compareTo("B"));//+ve
        System.out.println("A".compareTo("A"));// 0
        System.out.println("A".compareTo(null));//NullPointerException
    }
}

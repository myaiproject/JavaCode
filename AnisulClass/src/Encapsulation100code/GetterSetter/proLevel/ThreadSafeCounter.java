package Encapsulation100code.GetterSetter.proLevel;

//Thread-Safe Getters and Setters
public class ThreadSafeCounter {
    private int count;

    //Thread-safe getter
    public synchronized int getCount(){
        return count;
    }

    ////Thread-safe setter
    public synchronized void setCount(int count){
        this.count = count;

    }

    public static void main(String[] args) {
        ThreadSafeCounter th = new ThreadSafeCounter();
        th.setCount(10);
        System.out.println("Count: " + th.getCount());
    }
}

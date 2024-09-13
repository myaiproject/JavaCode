package Encapsulation100code.GetterSetter.proLevel;

public class LazyLoading {
    private String heavyData;

    public String getHeavyData() {
        if (heavyData == null){
            heavyData = "Loading heavy data...";
            // Simulate heavy loading
        }
        return heavyData;
    }

    public static void main(String[] args) {
        LazyLoading lazy = new LazyLoading();
        System.out.println(lazy.getHeavyData());
    }
}

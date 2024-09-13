package Encapsulation100code.accessModifiers;
//Accessing Default Members from Another Class in Same Package
public class DefaultAccess {
    int defaultVar = 50;
}
class Main6{
    public static void main(String[] args) {
        DefaultAccess obj = new DefaultAccess();
        System.out.println("Default variable: " + obj.defaultVar);
    }

}

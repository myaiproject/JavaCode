package practiceClasses.OOP.abstraction;

abstract class TAPAcademyBird {

    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends TAPAcademyBird{
    @Override
    void fly() {
        System.out.println("Eagle flies at great height.");
    }
}

class SerpentEagle extends Eagle{
    @Override
    void eat() {
        System.out.println("Serpent Eagle Hunts Over Mountain and eats.");
    }
}
class GoldenEagle extends Eagle{
    @Override
    void eat() {
        System.out.println("Golden Eagle Hunts Over Ocean and eats.");
    }
}
abstract class Testing extends GoldenEagle{

}

class Demo{
    public static void main(String[] args) {
        SerpentEagle ser = new SerpentEagle();
        ser.fly();
        ser.eat();
        GoldenEagle gol = new GoldenEagle();
        gol.fly();
        gol.eat();
    }
}



// This shows the implementation of polymorphism
public class Animals {
    public void makesound() {
        System.out.println("Grrr....");
    }
}

class Cats extends Animals {
    public void makesound() {
        System.out.println("Meow");
    }
}

class Dogs extends Animals {
    public void makesound() {
        System.out.println("Woof");
    }
}

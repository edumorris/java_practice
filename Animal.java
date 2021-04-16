public class Animal {
    protected int legs;

    public void eat() {
        System.out.println("Animal Eats");
    }

    void bark () {
        System.out.println("Woof-Woof");
    }
}

class Dog extends Animal {
    Dog() {
        legs = 4;
    }
}

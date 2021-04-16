// Polymorhism implementation
public class Polymorphism {
    public static void main(String[] args) {
        Animals a = new Dogs();
        Animals b = new Cats();

        a.makesound(); // prints Woof
        b.makesound(); // prints Meow
    }
}

public class Vehicle {
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;

    void horn() {
        System.out.println("Beep!");;
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        this.color = c;
    }
}

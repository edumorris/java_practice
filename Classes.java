public class Classes {
    public static void main(String[] args) {
        //Utilizes the Animal class/file
        Animal dog = new Animal();
        //dog.bark();

        // Utilizes the Vehicle class/file
        Vehicle v1 = new Vehicle("Green");
        Vehicle v2 = new Vehicle();
        /*
        v1.color = "red";
        This will change to make use of the setter method
        */
        v1.setColor("Yellow");
        // This utilizes getter to print out a variable
        System.out.println(v1.getColor());
        System.out.println(v2.getColor());
        v2.horn();
        
        Vehicle v = new Vehicle("Blue");
        System.out.println(v.getColor());
    }
}

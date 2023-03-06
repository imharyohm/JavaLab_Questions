public class concept {

    // Constructor for sphere
    public concept(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of sphere with radius " + radius + " is " + volume);
    }

    // Constructor for prism
    public concept(double length, double width, double height) {
        double volume = length * width * height;
        System.out.println("Volume of prism with dimensions " + length + " x " + width + " x " + height + " is " + volume);
    }

    // Constructor for cylinder
    public concept(double radius, double height) {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " is " + volume);
    }

    // Constructor for cone
    public concept(double radius, double height, String coneType) {
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of " + coneType + " cone with radius " + radius + " and height " + height + " is " + volume);
    }

    // Constructor for cuboid
    public concept(double length, double width, double height, String cuboidType) {
        double volume = length * width * height;
        System.out.println("Volume of " + cuboidType + " cuboid with dimensions " + length + " x " + width + " x " + height + " is " + volume);
    }

    public static void main(String[] args) {
        concept sphere = new concept(2.0);
        concept prism = new concept(3.0, 4.0, 5.0);
        concept cylinder = new concept(2.0, 5.0);
        concept rightCone = new concept(3.0, 6.0, "right");
        concept obliqueCone = new concept(3.0, 6.0, "oblique");
        concept cuboid = new concept(2.0, 3.0, 4.0, "rectangular");
    }
}

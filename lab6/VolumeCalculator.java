

//for constuctor overloading
class concept {

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
 
}

//for function overload
public class VolumeCalculator {
    
    public static double calculateVolume(double radius) {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
    
    public static double calculateVolume(double height, double length, double width) {
        return height * length * width;
    }
    
    public static double calculateVolume(double height, double radius) {
        return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
    
    public static double calculateVolume(double height, int baseWidth, double baseLength) {
        return (1.0/2.0) * baseWidth * baseLength * height;
    }
    
    public static void main(String[] args) {
        double sphereVolume = calculateVolume(3.0);
        System.out.println("Volume of sphere: " + sphereVolume);
        
        double prismVolume = calculateVolume(5.0, 10.0, 8.0);
        System.out.println("Volume of prism: " + prismVolume);
        
        double cylinderVolume = calculateVolume(6.0, 4.0);
        System.out.println("Volume of cylinder: " + cylinderVolume);
        
        double coneVolume = calculateVolume(10.0, 5.0);
        System.out.println("Volume of cone: " + coneVolume);
        
        double cuboidVolume = calculateVolume(6.0, 8, 10.0);
        System.out.println("Volume of cuboid: " + cuboidVolume);

        //using constuctor
        System.out.println("for Constuctors:");
        concept sphere = new concept(2.0);
        concept prism = new concept(3.0, 4.0, 5.0);
        concept cylinder = new concept(2.0, 5.0);
        concept rightCone = new concept(3.0, 6.0, "right");
        concept obliqueCone = new concept(3.0, 6.0, "oblique");
        concept cuboid = new concept(2.0, 3.0, 4.0, "rectangular");
    }
}

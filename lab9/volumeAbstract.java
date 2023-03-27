//3. Write a program to create an abstract class Volume having an abstract method find_volume(). Derive four class Sphere, Cylinder, Cuboid, Cone from Volume class with find_volume() functions implementation. Now override the find_Volume() functions through abstract class reference variable.

interface volume{
    void find_volume(float a, float b, float c);
}

class sphere implements volume{
    public void find_volume(float r, float h, float dummy){
        System.out.println("The volume of sphere is " + (float)((4/3)*3.14*r*r*r));
    }
}

class cylinder implements volume{
    public void find_volume(float r, float h, float dummy){
        System.out.println("The volume of cylinder is " + (float)3.14*r*r*h);
    }
}

class cuboid implements volume{
    public void find_volume(float l, float b, float h){
        System.out.println("The volume of cuboid is " + l*b*h);
    }
}

public class volumeAbstract {
    public static void main(String[] args) {
        volume sph = new sphere();
        sph.find_volume(4, 5, 0);
        volume cyl = new cylinder();
        cyl.find_volume(4, 5, 0);
        volume cube = new cuboid();
        cube.find_volume(4, 5, 6);
    }
}

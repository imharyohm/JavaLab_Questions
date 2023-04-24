// 4. Write a program to create a class named shape. It should contain 2 methods- draw() and erase()
// which should print “Drawing Shape” and “Erasing Shape” respectively. For this class we have three
// sub classes- Circle, Triangle and Square and each class override the parent class functions- draw
// () and erase (). The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing
// Square” respectively. The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing
// Square” respectively. Create objects of Circle, Triangle and Square and observe the polymorphic
// nature of the class by calling draw() and erase() method using each object.


import java.util.*;

class Shape{
    public void draw(){
        System.out.println("Drawing Shape");
    }
    public void erase(){
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");
    }
    public void erase(){
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape{
    public void draw(){
        System.out.println("Drawing Triangle");
    }
    public void erase(){
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape{
    public void draw(){
        System.out.println("Drawing Square");
    }
    public void erase(){
        System.out.println("Erasing Square");
    }
}

public class question4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Shape s = new Shape();
        // Circle c = new Circle();
        Triangle t = new Triangle();
        Square sq = new Square();
        // s.draw();
        // s.erase();
        // c.draw();
        // c.erase();
        t.draw();
        t.erase();
        sq.draw();
        sq.erase();
    }
}
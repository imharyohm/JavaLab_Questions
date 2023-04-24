// 2. Write a program in java to create a class TwoDshape having private data members width, height, name with default, parameterized constructors which initializes data members of class & copy
// constructor to copy one object values to another object. It also contains Member funcitons
// getWidth(), getHeight(), setWidth(double), setHeight(double), getName(), setName(String), showDimensions() and an abstract method double area(). Derive classes Traingle and Rectangle with
// all constructors in both the sub classes. 


import java.util.*;


class TwoDshape{
    private float width;
    private float height;
    private String name;
    TwoDshape(){
        width = 0;
        height = 0;
        name = " ";
    }
    TwoDshape(float width, float height, String name){
        this.width = width;
        this.height = height;
        this.name = name;
    }
    TwoDshape(TwoDshape t){
        this.width = t.width;
        this.height = t.height;
        this.name = t.name;
    }
    public float getWidth(){
        return width;
    }
    public float getHeight(){
        return height;
    }
    public String getName(){
        return name;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public void setHeight(float height){
        this.height = height;
    }
    public void setName(String name){
        this.name = name;
    }
    public void showDimensions(){
        System.out.println("Width: "+width);
        System.out.println("Height: "+height);
    }
    public double area(){
        return 0;
    }
}

class Triangle extends TwoDshape{
    Triangle(){
        super();
    }
    Triangle(float width, float height, String name){
        super(width, height, name);
    }
    Triangle(Triangle t){
        super(t);
    }
    public double area(){
        return 0.5*getWidth()*getHeight();
    }
}

class Rectangle extends TwoDshape{
    Rectangle(){
        super();
    }
    Rectangle(float width, float height, String name){
        super(width, height, name);
    }
    Rectangle(Rectangle r){
        super(r);
    }
    public double area(){
        return getWidth()*getHeight();
    }
}

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the triangle: ");
        float width = sc.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float height = sc.nextFloat();
        System.out.println("Enter the name of the triangle: ");
        String name = sc.next();
        Triangle t = new Triangle(width, height, name);
        Triangle t1 = new Triangle(t);
        System.out.println("Area of the triangle: "+t.area());
        System.out.println("Enter the width of the rectangle: ");
        width = sc.nextFloat();
        System.out.println("Enter the height of the rectangle: ");
        height = sc.nextFloat();
        System.out.println("Enter the name of the rectangle: ");
        name = sc.next();
        Rectangle r = new Rectangle(width, height, name);
        System.out.println("Area of the"+r.getName()+":"+r.area());
    }
}


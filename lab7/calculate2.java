import java.util.Scanner;

class data{
    float height,breath;
    Scanner input = new Scanner(System.in);
    void get_data(){
        System.out.println("Enter the height and breath:");
        height= input.nextFloat();
        breath=input.nextFloat();
    }
    void put_data(){
        System.out.println("height:"+height);
        System.out.println("breath;"+breath);
    }
}
class rectangle extends data{
    rectangle(){
        super();
    }
    void areaRectangle(){
        System.out.println("The area of rectangle:"+height*breath);
    }
    void perimeterRectangle(){
        System.out.println("The perimeter of rectangel:"+2*(height+breath));
    }
}
class triangle extends data{
    triangle(){
        super();
    }
    void areatriangle(){
        System.out.println("The area of triangle:"+0.5*height*breath);
    }
    void perimetertriangle(){
        System.out.println("The perimeter of triangel:"+2*(height+breath));
    }
}

public class calculate2 {
    public static void main(String args []){
        rectangle value = new rectangle();
        System.out.println("For rectangle");
        value.get_data();
        value.put_data();
        value.areaRectangle();
        value.perimeterRectangle();
        System.out.println("For Triangle");
        triangle value2 = new triangle();
        value2.get_data();
        value2.put_data();
        value2.areatriangle();
        value2.perimetertriangle();

    }
}

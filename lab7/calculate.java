class shape{
 double area;
  shape(double a){
    area=a;

  }

  void showarea(){
    System.out.println("The area of shape is:"+area);
  }
}

class circle extends shape{
    double radius;

    circle(double l,double are){
        super(are);
        radius=l;
    }
    void calarea(){
        area=(float)3.14*radius*radius;
    }
}

class rectangle extends shape{
    double lenght,breath;
    rectangle(double l, double b, double are){
        super(are);
        lenght=l;
        breath=b;
    }
    void calarea(){
        area=lenght*breath;
    }
}

public class calculate {
   public static void main(String args []){
    circle value = new circle(5, 0);
    value.calarea();
    value.showarea();
    rectangle value2 = new rectangle(5, 6, 0);
    value2.calarea();
    value2.showarea();

   } 
}

import java.util.Scanner;

class plate{
    double len,bre;
    plate(double length, double breath){
        len=length;
        bre=breath;
    }
}
class box extends plate{
    double hei;
    box(double length,double breath,double height){
        super(length,breath);
        hei=height;
    }
}
class woodbox extends box{
    double thi;
    woodbox(double length,double breath,double height,double thick){
        super(length,breath,height);
        thi=thick;
        System.out.println("lenght:"+len);
        System.out.println("breath"+bre);
        System.out.println("height:"+hei);
        System.out.println("thick:"+thi);
    }
}
public class constructor{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the woodbox:");
        double l = input.nextDouble();
        double b = input.nextDouble();
        double h = input.nextDouble();
        double t = input.nextDouble();
        woodbox sheet = new woodbox(l,b,h,t);
    }
}
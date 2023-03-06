import java.util.Scanner;

public class compex{
    int real;
    int img;
    Scanner sc =  new Scanner(System.in);
    void get(){
        System.out.println("Enter the real part:");
        real = sc.nextInt();
        System.out.println("Enter the img part:");
        img = sc.nextInt();
    }
    void get_display(){
        System.out.println("Compex number is:");
        System.out.println(real+"+"+"i"+img);
    }

    compex add(compex c1, compex c2){
        compex c = new compex();
        c.real=c1.real+c2.real;
        c.img=c1.img+c2.img;
        return c;
    }
     compex sub(compex c1, compex c2){
        compex c = new compex();
        c.real=c1.real-c2.real;
        c.img=c1.img-c2.img;
        return c;
    }

    public static void main(String args[]){
        compex c1= new compex(),c2=new compex(),c3=new compex();
        System.out.println("Enter the First compex number: ");
        c1.get();
        System.out.println("Enter the second compex number: ");
        c2.get();
        c1.get_display();
        c2.get_display();

        c3=c3.add(c1,c2);
        System.out.println("Additon of two compex number: ");
        c3.get_display();

         c3=c3.sub(c1,c2);
        System.out.println("subtarciton of two compex number: ");
        c3.get_display();



    }

}
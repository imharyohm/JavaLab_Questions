import java.util.Scanner;

// 2020 mid sem question 4b
import java.util.Scanner;
class Address{
    String street,city;
    int pin;
    Scanner input = new Scanner(System.in);
   void getAdress(){
    System.out.println("Enter the street and city name with pin:");
        street=input.nextLine();
        city=input.nextLine();
        pin=input.nextInt();
    }
    void setAdress(){
        System.out.println("Address is street:"+street);
        System.out.println("City:"+city);
        System.out.println("Pin:"+pin);
    }
}

class HomeAddress extends Address{
    void getAdress(){
        System.out.println("Enter the street and city name with pin:");
            street=input.nextLine();
            city=input.nextLine();
            pin=input.nextInt();
        }
        void setAdress(){
            System.out.println("Address is street:"+street);
            System.out.println("City:"+city);
            System.out.println("Pin:"+pin);
        }
}
class OfficeAddress extends Address{
    void getAdress(){
        System.out.println("Enter the street and city name with pin:");
            street=input.nextLine();
            city=input.nextLine();
            pin=input.nextInt();
        }
        void setAdress(){
            System.out.println("Address is street:"+street);
            System.out.println("City:"+city);
            System.out.println("Pin:"+pin);
        }
}
class SchoolAddress extends Address{
    void getAdress(){
        System.out.println("Enter the street and city name with pin:");
            street=input.nextLine();
            city=input.nextLine();
            pin=input.nextInt();
        }
        void setAdress(){
            System.out.println("Address is street:"+street);
            System.out.println("City:"+city);
            System.out.println("Pin:"+pin);
        }
}
public class AddressMain{
    public static void main(String[] args) {
        Address a1,a2,a3;
        a1=new HomeAddress();
        a2=new OfficeAddress();
        a3=new SchoolAddress();

        System.out.println("Home address:");
        a1.getAdress();
        a1.setAdress();

        System.out.println("Office Address");
        a2.getAdress();
        a2.setAdress();

        System.out.println("School Address:");
        a3.getAdress();
        a3.setAdress();
    }
}
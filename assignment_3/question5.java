// colors in it using applet programming. 5. Write a program in java to create class Bank having a data member ROI--which should be an user
// input for taking rate of interest of specific banks and member function Rate_of_Interest(). Make
// Derived classes HDFC, SBI and Kotak of Bank class, and Rate_of_Interest() function which returns ROI. override the derived class functions using
// a. method overriding concept
// b. abstract class
// c. Runtime polymorphism concept


import java.util.*;
import java.io.*;

abstract class Bank{
    double roi;
    Bank(double roi){
        this.roi = roi;
    }
    abstract void Rate_of_Interest();
}

class HDFC extends Bank{
    HDFC(double roi){
        super(roi);
    }
    void Rate_of_Interest(){
        System.out.println("Rate of interest of HDFC is: "+roi);
    }
}

class SBI extends Bank{
    SBI(double roi){
        super(roi);
    }
    void Rate_of_Interest(){
        System.out.println("Rate of interest of SBI is: "+roi);
    }
}

class Kotak extends Bank{
    Kotak(double roi){
        super(roi);
    }
    void Rate_of_Interest(){
        System.out.println("Rate of interest of Kotak is: "+roi);
    }
}
public class question5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate of interest of HDFC: ");
        double roi1 = sc.nextDouble();
        System.out.println("Enter the rate of interest of SBI: ");
        double roi2 = sc.nextDouble();
        System.out.println("Enter the rate of interest of Kotak: ");
        double roi3 = sc.nextDouble();
        HDFC h = new HDFC(roi1);
        SBI s = new SBI(roi2);
        Kotak k = new Kotak(roi3);
        h.Rate_of_Interest();
        s.Rate_of_Interest();
        k.Rate_of_Interest();
    }
}
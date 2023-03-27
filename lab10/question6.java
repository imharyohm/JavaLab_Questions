// 2.WAP in java to create user defined Exception called TIME_Exception where user
// have to check given time is valid or not. If not valid then throw TIME_Exception. The
// conditions are 0<hours<=23, 0<minutes<=59, 0<seconds<=59.

import java.util.Scanner;

class TIME_Exception extends Exception{
    TIME_Exception(String s){
        super(s);
    }
}



public class question6 {

    static void checkTime(int hours, int minutes, int seconds) throws TIME_Exception{
        if(hours<0 || hours>23){
            throw new TIME_Exception("Invalid hours");
        }
        if(minutes<=0 || minutes>59){
            throw new TIME_Exception("Invalid minutes");
        }
        if(seconds<=0 || seconds>59){
            throw new TIME_Exception("Invalid seconds");
        }
        System.out.println("Valid time");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours");
        int hours = sc.nextInt();
        System.out.println("Enter minutes");
        int minutes = sc.nextInt();
        System.out.println("Enter seconds");
        int seconds = sc.nextInt();

        try{
            checkTime(hours, minutes, seconds);
        }catch(TIME_Exception e){
            System.out.println(e);
        }
        // try{
        //     if(hours<0 || hours>23){
        //         throw new TIME_Exception("Invalid hours");
        //     }
        //     if(minutes<=0 || minutes>59){
        //         throw new TIME_Exception("Invalid minutes");
        //     }
        //     if(seconds<=0 || seconds>59){
        //         throw new TIME_Exception("Invalid seconds");
        //     }
        //     System.out.println("Valid time");
        // }catch(TIME_Exception e){
        //     System.out.println(e);
        // }
    }
}
// 1. WAP in java to create a user defined Exception called NegativeNumberException
// with a message given number is less than zero. Now handle the exception when user
// enters a negative number from the keyboard otherwise display the given positive
// number. 2.WAP in java


import java.util.Scanner;

class NegativeNumberException extends Exception{
    NegativeNumberException(String s){
        super(s);
    }
}


public class question7 {
    static void checkNumber(int num) throws NegativeNumberException{
        if(num<0){
            throw new NegativeNumberException("Given number is less than zero");
        }
        System.out.println("Given number is positive");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        try{
            checkNumber(num);
        }catch(NegativeNumberException e){
            System.out.println(e);
        }
    }
}

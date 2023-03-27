// WAP in java to handle following exceptions using try catch blocks. 
// A. ArithmeticException
// B. NullPointerException
// C. ArrayIndexOutOfBoundsException
// D. NumberFormatException

public class question2{
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        try{
            String s = null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        try{
            int[] arr = new int[5];
            arr[10] = 10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        try{
            int a = Integer.parseInt("abc");
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }
}
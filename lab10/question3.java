// 3. WAP in java to handle the following exceptions using nested try blocks.
//  A.ArrayIndexOutOfBoundsException
// B.NumberFormatException.


public class question3 {
    public static void main(String[] args) {
        try{
            try{
                int[] arr = new int[5];
                arr[10] = 10;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            try{
                int a = Integer.parseInt("A");
            }catch(NumberFormatException e){
                System.out.println("NumberFormatException");
            }
            System.out.println("hello world");

            int b = 10/0;
        }
        
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

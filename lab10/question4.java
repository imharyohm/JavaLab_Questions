// B.NumberFormatException. 4. WAP in java to handle following exceptions using try with multiple catch blocks. A. ArithmeticException
// B. NullPointerException
// C. ArrayIndexOutOfBoundsException
// D. NumberFormatException
// E. Exception
public class question4 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
            String s = null;
            System.out.println(s.length());
            int[] arr = new int[5];
            arr[10] = 10;
            int b = Integer.parseInt("abc");
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch(NullPointerException e){
            System.out.println("NullPointerException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

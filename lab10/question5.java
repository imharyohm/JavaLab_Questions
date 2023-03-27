// 5. Prove the statement with an example that Derived class Exception catch blocks
// should be written before the base class Exception catch block.

public class question5 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(Exception e){
            System.out.println("Exception");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }
}


//here we can see that the base class Exception catch block is written after the derived class ArithmeticException catch block. 
// So, the program will not compile.

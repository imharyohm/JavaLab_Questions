// c 4.Write a program in java to handle exception along with finally block with three
// different conditions like finally block will be handled if exceptions occurs or don’t
// occur.


public class question2{
    public static void main(String[] args) {
        try{
            int a = 10/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured");
        }
        finally{
            System.out.println("Finally block");
        }
    }
}

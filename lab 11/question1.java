// 3. Write a program to handle IOException with throws and throw concept.
import java.io.IOException;

public class question1 {
    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        int c = 0;
        try {
            a = System.in.read();
            b = System.in.read();
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println("Result: " + c);
    }
}

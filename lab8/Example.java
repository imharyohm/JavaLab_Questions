import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a byte value: ");
        byte value = scanner.nextByte();
        System.out.println("The entered value is: " + value);
        
        scanner.close();
    }
}

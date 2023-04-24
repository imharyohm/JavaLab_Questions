
import calculator.Simple; // Import the calculator package

public class question2 {
    public static void main(String[] args) {
        // Create an object of Calculation class
        Simple calculator = new Simple();

        // Call the calculator functions
        int a = 10, b = 5;
        System.out.println("Addition: " + calculator.add(a, b));
        System.out.println("Subtraction: " + calculator.sub(a, b));
        System.out.println("Multiplication: " + calculator.mul(a, b));
        System.out.println("Division: " + calculator.div(a, b));
    }
}
package letMeCalculate;
import calculator.Calc;

public class Calculate {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println("Sum: " + obj.add(4, 5));
        System.out.println("Subtraction: " + obj.sub(5, 5));
        System.out.println("Multiplication: " + obj.multiplication(4, 5));
        System.out.println("Division: " + obj.division(4, 5));
    }
}

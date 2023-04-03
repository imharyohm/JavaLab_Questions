//3.Write a program to handle IOException with throws and throw concept.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question1 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a number: ");
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (IOException e) {
            System.out.println("Error reading input: " );
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " );
        } 
    }
}

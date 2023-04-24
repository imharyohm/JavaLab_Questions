// 1. Write a class Temperature that converts temperature between Fahrenheit (F) and Celsius (C). The
// formulas for conversion between the to units are:
// F= (9.0 x Celsius)/5.0 + 32.0
// C=(Fahrenheit-32.0) x 5.0/9.0
// The program should throw the exception of type NumberFormatException if the number of degrees is
// not a legal floating point number. The program should check the data from the command line and
// give suitable feedback.

public class Temperature {
    public static double convertToFahrenheit(double celsius) {
        double fahrenheit = (9.0 * celsius) / 5.0 + 32.0;
        return fahrenheit;
    }

    public static double convertToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        return celsius;
    }

    public static void main(String[] args) {
        // if (args.length != 2) {
        //     System.out.println("Usage: java Temperature <temperature> <unit>");
        //     System.out.println("Unit should be 'F' for Fahrenheit or 'C' for Celsius.");
        //     System.exit(1);
        // }

        double temperature;
        String unit = args[1];

        try {
            temperature = Double.parseDouble(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid temperature value. Please enter a valid number.");
            System.exit(1);
            return;
        }

        if (unit.equalsIgnoreCase("F")) {
            double celsius = convertToCelsius(temperature);
            System.out.println(temperature + " Fahrenheit is equivalent to " + celsius + " Celsius.");
        } else if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = convertToFahrenheit(temperature);
            System.out.println(temperature + " Celsius is equivalent to " + fahrenheit + " Fahrenheit.");
        } else {
            System.out.println("Error: Invalid unit. Unit should be 'F' for Fahrenheit or 'C' for Celsius.");
        }
    }
}

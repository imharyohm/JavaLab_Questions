//5. Write a program in java to convert Number into words.

import java.util.Scanner;

public class NumberToWords {
  
  private static final String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

  private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

  public static String convert(int n) {
    if (n < 0) {
      return "Minus " + convert(-n);
    }

    if (n < 20) {
      return units[n];
    }

    if (n < 100) {
      return tens[n / 10] + ((n % 10 != 0) ? units[n % 10]: "");
    }

    if (n < 1000) {
      return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " and " : "") + convert(n % 100);
    }

    if (n < 1000000) {
      return convert(n / 1000) + " Thousand" + ((n % 1000 != 0) ? " " : "") + convert(n % 1000);
    }

    if (n < 1000000000) {
      return convert(n / 1000000) + " Million" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
    }

    return convert(n / 1000000000) + " Billion" + ((n % 1000000000 != 0) ? " " : "") + convert(n % 1000000000);
  }
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = in.nextInt();
    System.out.println(convert(number));
  }
}

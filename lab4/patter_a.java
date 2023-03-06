//4. Write a Program in java to print the following patterns using for loops.
//A.
// *000*000*
// 0*00*00*0
// 00*0*0*00
// 000***000

public class patter_a {
    public static void main(String[] args) {
        int lines = 4;
        int i, j;
        for (i = 1; i <= lines; i++) {
            for (j = 1; j <= lines; j++) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
            }
            j--;
            System.out.print("*");
            while (j >= 1) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print("0");
                j--;
            }
            System.out.println("");
        }
    }
}
//  3. Write a program to apply the following methods on user entered string.” I am proud to be a KIIT
// Student ”. Display the output on applying each method. 1) replace()
// 2) trim()
// 3) spilt()
// 4) charat()
// 5) substring()



import java.util.*;

public class question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("replace(): "+str.replace("K", "k"));
        System.out.println("trim(): "+str.trim());
        System.out.println("split(): "+Arrays.toString(str.split(" ")));
        System.out.println("charAt(): "+str.charAt(0));
        System.out.println("substring(): "+str.substring(0, 5));
    }
}
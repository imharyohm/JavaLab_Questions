import java.util.Scanner;

public class spynum {
  public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    num = sc.nextInt();
    int originalNum = num;
    int reverseNum = 0;
    int sum=0;
    int product=1;
    while(num!=0){
        int lastDigit= num%10;
        sum=sum+lastDigit;
        product=product*lastDigit;
        num=num/10;
    }
    if(sum==product)
    System.out.println("Number is spy value");
    else
    System.out.println("Number is not spy value");
    
  }
}

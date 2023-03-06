import java.util.Scanner;



public class account{
    String id,name,brach;
     static int balance;
     Scanner sc = new Scanner(System.in);
    void get(){
        System.out.println("Enter id name and branch of customer:");
        id= sc.next();
        name=sc.next();
        brach=sc.next();
        System.out.println("Enter balance:");
        balance=sc.nextInt();
    }
    void get_display(){
         System.out.println("Name :"+name);
        System.out.println("ID:"+id);
        System.out.println("Branch:"+brach);
        System.out.println("Balance:"+balance);
    }
    void withdraw(int amt){
        balance=balance-amt;
    }
    void deposite(int amt){
        balance=balance+amt;
    }

    public static void main(String args[]){
        account a= new account();
        a.get();
        a.get_display();
        Scanner ab = new Scanner(System.in);
        int amt;
        System.out.println("Enter the withdrew amount:");
        amt= ab.nextInt();
        a.withdraw(amt);
        a.get_display();
        System.out.println("Enter the deposit amount:");
        amt=ab.nextInt();
        a.deposite(amt);
        a.get_display();
    }
}
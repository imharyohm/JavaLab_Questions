// 5.Write a program to create an Account class containing acc_no, balance as data members and
// display() to display account details. Inherit it in Person class with all mentioned data members and
// functions. Person class also has name and aadhar_no as extra data members of its own. Override
// display() function of person’s class. Test your program with minimum 5 persons details.


import java.util.*;

class Account{
    int acc_no;
    double balance;
    Account(int acc_no, double balance){
        this.acc_no = acc_no;
        this.balance = balance;
    }
    public void display(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}

class Person extends Account{
    String name;
    int aadhar_no;
    Person(int acc_no, double balance, String name, int aadhar_no){
        super(acc_no, balance);
        this.name = name;
        this.aadhar_no = aadhar_no;
    }
    public void display(){
        super.display();
        System.out.println("Name: "+name);
        System.out.println("Aadhar Number: "+aadhar_no);
    }
}

public class question5{
    public static void main(String[] args) {
        Person p1 = new Person(123456, 10000, "Rahul", 123456789);
        p1.display();
    }
}

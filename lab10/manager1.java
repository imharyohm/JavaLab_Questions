// Define an interface with three methods – earnings(), deductions() and bonus() and
// define a Java class, “Manager” which uses this interface without implementing bonus()
// method. Also define another Java class ,”Substaff” which extends from, “Manager”
// class and implements bonus() method. Write the complete program to find out
// earnings, deduction and bonus of a substaff with basic salary amount entered by the
// user as per the following guidelines –
// earnings basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF 12% of basic
// bonus 50% of basic

import java.util.Scanner;
interface Employee
{
    void earnings();
    void deductions();
    void bonus();
}
class Manager implements Employee
{
    int basic;
    double da,hra,pf,earn,ded,bon;
    Scanner sc=new Scanner(System.in);
    public void earnings()
    {
        System.out.println("Enter basic salary");
        basic=sc.nextInt();
        da=0.8*basic;
        hra=0.15*basic;
        earn=basic+da+hra;
        System.out.println("Earnings = "+earn);
    }
    public void deductions()
    {
        pf=0.12*basic;
        ded=pf;
        System.out.println("Deductions = "+ded);
    }
    public void bonus()
    {}
}
class Substaff extends Manager
{
    public void bonus()
    {
        bon=0.5*basic;
        System.out.println("Bonus = "+bon);
    }
}
public class manager1
{
    public static void main(String args[])
    {
        Substaff s=new Substaff();
        s.earnings();
        s.deductions();
        s.bonus();
    }
}


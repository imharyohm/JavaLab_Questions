// 1. Create an interface currency that contains two methods moneyconversion()(rupees to dollar or
// vice versa) and countrycurrency() methods. Create a class currencyconversion to implement the
// currency interface and its methods. In the main method class create an object for the class to invoke
// the methods of the interface and test it?


import java.util.Scanner;
interface currency
{
    abstract void moneyconversion();
    abstract void countrycurrency();
}


class currencyconversion implements currency
{
    float rupees;
    float dollar;
    currencyconversion(float rupees, float dollar)
    {
        this.rupees = rupees;
        this.dollar = dollar;
    }
    public void moneyconversion()
    {
        if(rupees!=0){
            dollar = rupees/70;
            System.out.println("Dollar: "+dollar);
        }
        else if(dollar!=0){
            rupees = dollar*70;
            System.out.println("Rupees: "+rupees);
        }
        else{
            System.out.println("Invalid Input");
        }

    }
    public void countrycurrency()
    {
        System.out.println("Country Currency");
    }
}

public class question1 extends currencyconversion
{   
    question1(float rupees, float dollar)
    {
        super(rupees, dollar);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount in rupees: ");
        float rupees = sc.nextFloat();
        System.out.println("Enter the amount in dollar: ");
        float dollar = sc.nextFloat();
        question1 cc = new question1(rupees, dollar);
        cc.moneyconversion();
        cc.countrycurrency();
    }

}


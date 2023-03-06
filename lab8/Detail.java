import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Detail {
    String name, address,meterNo;
    Detail(String n,String a, String meterNo){
        name=n;
        address=a;
        this.meterNo=meterNo;
    }

    void show(){
        System.out.println("Details of Cusotmer:");
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("MetreNumber:"+meterNo);
    }
    class powerBill{
        int n;
        float total;
        powerBill(int n,float total){
            this.n=n;
            this.total=total;
        }
        void cal(){
            // if(n<=50){
            //     total=(float)2.5*n;
            // }
            // else if(n>50 && n<=100){
            //     int temp=n;
            //     temp=temp-50;
            //     total=50*(float)2.5+temp*5;
            // }
            // else if(n>100 && n<=200){
            //     int temp=n;
            //     temp=temp-100;
            //     total=50*(float)2.5+100*(float)5+temp*6;
            // }
            // else{
            //     int temp=n;
            //     temp=temp-200;
            //     total=50*(float)2.5+100*(float)5+temp*6;
            // }
            if(n<=50){
                total=(float)2.5*n;
            }
            else if(n>50 && n<=100){
                int temp=n;
                
                total=temp*5;
            }
            else if(n>100 && n<=200){
                int temp=n;
                total=temp*6;
            }
            else{
                int temp=n;
                total=temp*(float)7.5;
            }

        }
        void show(){
            System.out.println("Units:"+n);
            System.out.println("Total amount:"+total);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Detail d = new Detail("Hariom", "BirGUnj", "456789");
        d.show();
        Detail.powerBill pow = d.new powerBill(100, 0);
            pow.cal();
            pow.show();
    }
}




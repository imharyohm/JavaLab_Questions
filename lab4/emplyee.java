import java.util.Scanner;
public class emplyee{
    String name;
    int id;
    double salary;
    Scanner sc = new Scanner(System.in);
    void get_info(){
        System.out.println("Enter name,id and salary:");
        name=sc.next();
        id=sc.nextInt();
        salary=sc.nextDouble();
    }
    void get_display(){
        System.out.println("Name of emplyee:"+name);
        System.out.println("ID:"+id);
        System.out.println("Salary:"+salary);
       

    }
    public static void main(String args[]){
     emplyee s1=new emplyee();
        s1.get_info();
        s1.get_display();
    }
}
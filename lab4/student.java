import java.util.Scanner;
public class student{
    String name,branch,university;
    int roll;
    Scanner sc = new Scanner(System.in);
    void get_info(){
        System.out.println("Enter name roll branch university:");
        name=sc.next();
        roll=sc.nextInt();
        branch=sc.next();
        university=sc.next();
    }
    void get_display(){
        System.out.println("Name of student"+name);
        System.out.println("Roll:"+roll);
        System.out.println("Branch:"+branch);
        System.out.println("Name of university:"+university);

    }
    public static void main(String args[]){
        student s1=new student();
        s1.get_info();
        s1.get_display();
    }
}
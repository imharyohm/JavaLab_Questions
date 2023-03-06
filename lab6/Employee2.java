abstract class Runnable{
    public abstract void show();
}
public class Employee2 {
    private int ID;
    private String company_name;
    private double salary;
    
    Employee2(int id, String company, double sal) {
        ID = id;
        company_name = company;
        salary = sal;
    }
    
    // Inner class
    public class Programmer {
        public void get_Emp_details() {
            System.out.println("Employee2 ID: " + ID);
            System.out.println("Company Name: " + company_name);
            System.out.println("Salary: " + salary);
        }
    }
    
    // Static Nested class
    public static class Manager {
        public void get_Emp_details(Employee2 emp) {
            System.out.println("Employee2 ID: " + emp.ID);
            System.out.println("Company Name: " + emp.company_name);
            System.out.println("Salary: " + emp.salary);
        }
    }
    
    // Method Local Inner class
    public void displayEmpDetails() {
        class Display {
            public void show() {
                System.out.println("Employee2 ID: " + ID);
                System.out.println("Company Name: " + company_name);
                System.out.println("Salary: " + salary);
            }
        }
        Display d = new Display();
        d.show();
    }
    
    // Anonymous Inner class
    public void details() {
        Runnable r = new Runnable() {
            public void show() {
                System.out.println("By anonymous class");
                System.out.println("Employee2 ID: " + ID);
                System.out.println("Company Name: " + company_name);
                System.out.println("Salary: " + salary);
            }
        };
        r.show();
    }
    
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2(101, "ABC Company", 50000.00);
        
        // Accessing inner class
        Employee2.Programmer p = emp1.new Programmer();
        p.get_Emp_details();
        
        // Accessing static nested class
        Employee2.Manager m = new Employee2.Manager();
        m.get_Emp_details(emp1);
        
        // Accessing method local inner class
        emp1.displayEmpDetails();
        
        // Accessing anonymous inner class
        emp1.details();
    }
}

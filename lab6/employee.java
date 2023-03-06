import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class employee {
    private String name;
    private int employee_id;
    private double salary;

    // Default constructor
    public employee() {
        name = "";
        employee_id = 0;
        salary = 0.0;
    }

    // Parameterized constructor
    public employee(String name, int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }

    // Copy constructor
    public employee(employee emp) {
        name = emp.name;
        employee_id = emp.employee_id;
        salary = emp.salary;
    }

    // Member function to display employee information
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("employee ID: " + employee_id);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Creating employee object using default constructor
        employee emp1 = new employee();
        System.out.println("Enter name: ");
        emp1.name = br.readLine();
        System.out.println("Enter employee ID: ");
        emp1.employee_id = Integer.parseInt(br.readLine());
        System.out.println("Enter salary: ");
        emp1.salary = Double.parseDouble(br.readLine());
        System.out.println("employee 1 information:");
        emp1.show();

        // Creating employee object using parameterized constructor
        System.out.println("Enter name: ");
        String name = br.readLine();
        System.out.println("Enter employee ID: ");
        int employee_id = Integer.parseInt(br.readLine());
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(br.readLine());
        employee emp2 = new employee(name, employee_id, salary);
        System.out.println("employee 2 information:");
        emp2.show();

        // Creating employee object using copy constructor
        employee emp3 = new employee(emp1);
        System.out.println("employee 3 information:");
        emp3.show();
    }
}

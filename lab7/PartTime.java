class Employee {
    String name;
    int emp_id;
    double salary;

    public Employee(String name, int emp_id, double salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }

 }

class Regular extends Employee {
    double da;
    double hra;
    double basicSalary;

    public Regular(String name, int emp_id, double salary, double da, double hra, double basicSalary) {
        super(name, emp_id, salary);
        this.da = da;
        this.hra = hra;
        this.basicSalary = basicSalary;
    }
    double calculateSalary() {
        return  basicSalary + da  + hra ;
    }
}

public class PartTime extends Employee {
    double hours;
    double payPerHour;

    public PartTime(String name, int emp_id, double salary, double hours, double payPerHour) {
        super(name, emp_id, salary);
        this.hours = hours;
        this.payPerHour = payPerHour;
    }
    double calPartTimeSalary() {
        return hours * payPerHour;
    }

    public static void main(String[] args) {
        Regular regular_emp = new Regular("Hariom", 123, 0, 1000, 500, 40000);
        PartTime part_time_emp = new PartTime("Shyam", 456, 0, 20, 1000);

        System.out.println("Regular Employee " + regular_emp.name + " earns a salary of Rs. " + regular_emp.calculateSalary());
        System.out.println("Part-Time Employee " + part_time_emp.name + " earns a salary of Rs. " + part_time_emp.calPartTimeSalary());

    }
}

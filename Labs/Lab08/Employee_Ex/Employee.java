package Labs.Lab08.Employee_Ex;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee: " + name + ", Salary: $" + salary;
    }
}
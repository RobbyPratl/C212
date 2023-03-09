package Labs.Lab08.Employee_Ex;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) {
        department = newDepartment;
    }

    @Override
    public String toString() {
        return super.toString() + ", Department: " + department;
    }
}

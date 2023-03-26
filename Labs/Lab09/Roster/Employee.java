public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private boolean isExecutive;

    public Employee(String name, int salary, boolean isExecutive) {
        this.name = name;
        this.salary = salary;
        this.isExecutive = isExecutive;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    @Override
    public int compareTo(Employee other) {
        if (this.isExecutive() && !other.isExecutive()) {
            return -1;
        } else if (!this.isExecutive() && other.isExecutive()) {
            return 1;
        } else if (this.isExecutive() && other.isExecutive()) {
            return this.name.compareTo(other.name);
        } else {
            return this.name.compareTo(other.name);
        }
    }
}
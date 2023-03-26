import java.util.Arrays;

public class Roster {
    private Employee[] employees;

    public Roster(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        Employee[] sortedEmployees = Arrays.copyOf(employees, employees.length);
        Arrays.sort(sortedEmployees);
        return sortedEmployees;
    }

    public String toString() {
        String result = "";
        for (Employee e : getEmployees()) {
            result += e + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("John", 100000, true);
        employees[1] = new Employee("Jane", 100000, true);
        employees[2] = new Employee("Bob", 100000, false);
        employees[3] = new Employee("Alice", 100000, false);
        employees[4] = new Employee("Zoe", 100000, false);
        Roster roster = new Roster(employees);
        System.out.println(roster);
    }

}
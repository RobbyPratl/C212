package Labs.Lab08.Employee_Ex;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void testGetSalary() {
        Employee e = new Employee("John Doe", 50000.0);
        assertEquals(50000.0, e.getSalary(), 0.01);
    }

    @Test
    public void testSetSalary() {
        Employee e = new Employee("Jane Doe", 60000.0);
        e.setSalary(70000.0);
        assertEquals(70000.0, e.getSalary(), 0.01);
    }

    @Test
    public void testToString() {
        Employee e = new Employee("John Smith", 40000.0);
        assertEquals("Employee: John Smith, Salary: $40000.0", e.toString());
    }

}

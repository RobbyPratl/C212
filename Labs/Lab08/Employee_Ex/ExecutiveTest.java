package Labs.Lab08.Employee;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class ExecutiveTest {
    @Test
    public void testGetDepartment() {
        Manager m = new Manager("Jane Smith", 70000.0, "Sales");
        assertEquals("Sales", m.getDepartment());
    }

    @Test
    public void testSetDepartment() {
        Manager m = new Manager("John Smith", 60000.0, "Marketing");
        m.setDepartment("HR");
        assertEquals("HR", m.getDepartment());
    }

    @Test
    public void testToString() {
        Manager m = new Manager("Jane Doe", 70000.0, "Sales");
        assertEquals("Employee: Jane Doe, Salary: $70000.0, Department: Sales", m.toString());
    }
}

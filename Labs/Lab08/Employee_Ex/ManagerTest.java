package Labs.Lab08.Employee;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class ManagerTest {

    @Test
    public void testGetNumberOfShares() {
        Executive e = new Executive("John Smith", 100000.0, "Executive", 1000);
        assertEquals(1000, e.getNumberOfShares());
    }

    @Test
    public void testSetNumberOfShares() {
        Executive e = new Executive("Jane Smith", 120000.0, "Financial", 2000);
        e.setNumberOfShares(2500);
        assertEquals(2500, e.getNumberOfShares());
    }

    @Test
    public void testGetSharesOwnedByExecutives() {
        Executive e1 = new Executive("John Doe", 150000.0, "Executive", 1000);
        Executive e2 = new Executive("Jane Doe", 180000.0, "Financial", 2000);
        assertEquals(3000, Executive.getSharesOwnedByExecutives());
    }

    @Test
    public void testToString() {
        Executive e = new Executive("John Doe", 150000.0, "Executive", 1000);
        assertEquals("Employee: John Doe, Salary: $150000.0, Shares Owned: 1000", e.toString());
    }
}

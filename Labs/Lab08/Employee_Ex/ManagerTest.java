package Labs.Lab08.Employee_Ex;

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
        Executive executive1 = new Executive("John", 100000, "Marketing", 500);
        Executive executive2 = new Executive("Jane", 120000, "Finance", 1000);

        executive1.setNumberOfShares(800);
        executive2.setNumberOfShares(500);

        assertEquals(800, executive1.getSharesOwned());
        assertEquals(500, executive2.getSharesOwned());
    }

    @Test
    public void testToString() {
        Executive e = new Executive("John Doe", 150000.0, "Executive", 1000);
        assertEquals("Employee: John Doe, Salary: $150000.0, Shares Owned: 1000", e.toString());
    }
}

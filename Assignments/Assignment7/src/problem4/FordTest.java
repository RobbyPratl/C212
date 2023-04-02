package problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FordTest {
    @Test
    void testGetMileage() {
        Ford ford = new Ford(1, 20, 50000);
        assertEquals(50000, ford.getMileage());
    }

    @Test
    void testSetMileage() {
        Ford ford = new Ford(1, 20, 50000);
        ford.setMileage(60000);
        assertEquals(60000, ford.getMileage());

        ford.setMileage(-10000);
        assertEquals(0, ford.getMileage());
    }

    @Test
    void testToString() {
        Ford ford = new Ford(1, 20, 50000);
        String expected = "Gear: 1\nSpeed: 20\nMileage: 50000";
        assertEquals(expected, ford.toString());
    }

}

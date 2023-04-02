package problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VolkswagenTest {

    @Test
    public void testConstructorAndGetters() {
        Volkswagen car = new Volkswagen(1, 50, 20000);
        assertEquals(1, car.getGear());
        assertEquals(50, car.getSpeed());
        assertEquals(20000, car.getMileage());
    }

    @Test
    public void testSetters() {
        Volkswagen car = new Volkswagen(1, 50, 20000);
        car.setGear(2);
        car.setSpeed(60);
        car.setMileage(25000);
        assertEquals(2, car.getGear());
        assertEquals(60, car.getSpeed());
        assertEquals(25000, car.getMileage());
    }

    @Test
    public void testToString() {
        Volkswagen car = new Volkswagen(1, 50, 20000);
        assertEquals("Gear: 1\nSpeed: 50\nMileage: 20000", car.toString());
    }
}

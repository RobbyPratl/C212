package problem4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car(1, 0, 0);
    }

    @Test
    public void testGetMileage() {
        Assertions.assertEquals(0, car.getMileage());
    }

    @Test
    public void testSetMileage() {
        car.setMileage(10000);
        Assertions.assertEquals(10000, car.getMileage());
        car.setMileage(-10000);
        Assertions.assertEquals(0, car.getMileage());
    }

    @Test
    public void testToString() {
        Assertions.assertEquals("Gear: 1\nSpeed: 0\nMileage: 0", car.toString());
    }

    @Test
    public void testAccelerate() {
        car.accelerate(30);
        Assertions.assertEquals(30, car.getSpeed());
        car.accelerate(40);
        Assertions.assertEquals(70, car.getSpeed());
    }

    @Test
    public void testBrake() {
        car.accelerate(50);
        car.brake(20);
        Assertions.assertEquals(30, car.getSpeed());
        car.brake(50);
        Assertions.assertEquals(0, car.getSpeed());
    }
}

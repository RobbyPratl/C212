package problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    @Test
    void testGettersAndSetters() {
        Vehicle vehicle = new Vehicle(1, 10);

        assertEquals(1, vehicle.getGear());
        assertEquals(10, vehicle.getSpeed());

        vehicle.setGear(2);
        vehicle.setSpeed(20);

        assertEquals(2, vehicle.getGear());
        assertEquals(20, vehicle.getSpeed());
    }

    @Test
    void testAccelerate() {
        Vehicle vehicle = new Vehicle(1, 10);

        vehicle.accelerate(5);
        assertEquals(15, vehicle.getSpeed());

        vehicle.accelerate(10);
        assertEquals(25, vehicle.getSpeed());
    }

    @Test
    void testBrake() {
        Vehicle vehicle = new Vehicle(1, 10);

        vehicle.brake(5);
        assertEquals(5, vehicle.getSpeed());

        vehicle.brake(10);
        assertEquals(0, vehicle.getSpeed());
    }
}

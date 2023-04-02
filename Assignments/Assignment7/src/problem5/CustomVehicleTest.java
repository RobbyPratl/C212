package problem5;

import org.junit.jupiter.api.Test;
import problem1.*;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CustomVehicleTest {
    @Test
    void testAddPassenger() {
        CustomVehicle vehicle = new CustomVehicle(1, 0, 2);
        Driver person1 = new Driver("Alice", 21);
        Passenger person2 = new Passenger("Bob", 16);
        Passenger person3 = new Passenger("Charlie", 47);

        assertEquals(0, vehicle.getPassengers().size());
        vehicle.addPassenger(person1);
        assertEquals(1, vehicle.getPassengers().size());
        vehicle.addPassenger(person2);
        assertEquals(2, vehicle.getPassengers().size());
        vehicle.addPassenger(person3);
        assertEquals(2, vehicle.getPassengers().size());

        List<Person> passengers = vehicle.getPassengers();
        assertTrue(passengers.contains(person1));
        assertTrue(passengers.contains(person2));
        assertFalse(passengers.contains(person3));

    }

    @Test
    void testRemovePassenger() {
        CustomVehicle vehicle = new CustomVehicle(1, 0, 2);
        Driver person1 = new Driver("Alice", 18);
        Passenger person2 = new Passenger("Bob", 9);
        Passenger person3 = new Passenger("Charlie", 12);

        vehicle.addPassenger(person1);
        vehicle.addPassenger(person2);
        assertEquals(2, vehicle.getPassengers().size());

        vehicle.addPassenger(person3);
        vehicle.removePassenger(person3);
        assertEquals(2, vehicle.getPassengers().size());

        vehicle.removePassenger(person2);
        assertEquals(1, vehicle.getPassengers().size());
        assertFalse(vehicle.getPassengers().contains(person2));
    }

    @Test
    void testSetCapacity() {
        CustomVehicle vehicle = new CustomVehicle(1, 0, 2);
        vehicle.setCapacity(3);
        assertEquals(3, vehicle.getCapacity());

        vehicle.setCapacity(-1);
        assertEquals(3, vehicle.getCapacity());
    }

    @Test
    void testStartVehicle() {
        CustomVehicle vehicle = new CustomVehicle(1, 0, 2);
        Driver licensedDriver = new Driver("Alice", 18);
        Driver unlicensedDriver = new Driver("Bob", 11);
        Passenger passenger = new Passenger("Charlie", 12);

        assertFalse(vehicle.startVehicle());

        vehicle.addPassenger(licensedDriver);
        assertTrue(vehicle.startVehicle());

        vehicle.addPassenger(passenger);
        assertTrue(vehicle.startVehicle());

        vehicle.removePassenger(passenger);
        vehicle.addPassenger(unlicensedDriver);
        assertTrue(vehicle.startVehicle());

        unlicensedDriver.setLicensed(true);
        assertTrue(vehicle.startVehicle());
    }

}

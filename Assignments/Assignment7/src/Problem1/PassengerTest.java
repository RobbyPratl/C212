package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PassengerTest {
    private Passenger passenger;

    @BeforeEach
    void setUp() {
        passenger = new Passenger("Jane Doe", 30);
    }

    @Test
    void testGetName() {
        assertEquals("Jane Doe", passenger.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(30, passenger.getAge());
    }

    @Test
    void testSetAgeZero() {
        passenger.setAge(0);
        assertEquals(0, passenger.getAge());
    }

    @Test
    void testSetAgeNegative() {
        passenger.setAge(-10);
        assertEquals(0, passenger.getAge());
    }

    @Test
    void testGetDetails() {
        assertEquals("Name: Jane Doe\nAge: 30", passenger.getDetails());
    }
}

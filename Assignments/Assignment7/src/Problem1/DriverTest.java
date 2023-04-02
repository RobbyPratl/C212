package problem1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DriverTest {
    private Driver driver;

    @BeforeEach
    void setUp() {
        driver = new Driver("John Smith", 25);
    }

    @Test
    void testGetName() {
        assertEquals("John Smith", driver.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(25, driver.getAge());
    }

    @Test
    void testIsLicensed() {
        assertTrue(driver.isLicensed());
    }

    @Test
    void testSetAgeNotLicensed() {
        driver.setAge(15);
        assertFalse(driver.isLicensed());
    }

    @Test
    void testSetAgeLicensed() {
        driver.setAge(16);
        assertTrue(driver.isLicensed());
    }

    @Test
    void testSetAgeZero() {
        driver.setAge(0);
        assertEquals(0, driver.getAge());
    }

    @Test
    void testSetAgeNegative() {
        driver.setAge(-10);
        assertEquals(0, driver.getAge());
    }

    @Test
    void testGetDetails() {
        assertEquals("John Smith, 25, Licensed", driver.getDetails());
    }
}


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class addressTest {

    @Test
    public void testConstructorWithApartmentNumber() {
        Address address = new Address(123, "Main St", 456, "Anytown", "CA", 12345);
        assertNotNull(address);
    }

    @Test
    public void testConstructorWithoutApartmentNumber() {
        Address address = new Address(123, "Main St", "Anytown", "CA", 12345);
        assertNotNull(address);
    }

    @Test
    public void testGettersAndSetters() {
        Address address = new Address(123, "Main St", 456, "Anytown", "CA", 12345);
        assertEquals(123, address.getHouseNumber());
        address.setHouseNumber(456);
        assertEquals(456, address.getHouseNumber());

        assertEquals("Main St", address.getStreet());
        address.setStreet("Second St");
        assertEquals("Second St", address.getStreet());

        assertEquals(Integer.valueOf(456), address.getApartmentNumber());
        address.setApartmentNumber(789);
        assertEquals(Integer.valueOf(789), address.getApartmentNumber());

        assertEquals("Anytown", address.getCity());
        address.setCity("Othertown");
        assertEquals("Othertown", address.getCity());

        assertEquals("CA", address.getState());
        address.setState("NY");
        assertEquals("NY", address.getState());

        assertEquals(12345, address.getZipCode());
        address.setZipCode(67890);
        assertEquals(67890, address.getZipCode());
    }

    @Test
    public void testToStringWithApartmentNumber() {
        Address address = new Address(123, "Main St", 456, "Anytown", "CA", 12345);
        String expected = "123 Main St Apt 456\nAnytown, CA 12345";
        assertEquals(expected, address.toString());
    }

    @Test
    public void testToStringWithoutApartmentNumber() {
        Address address = new Address(123, "Main St", "Anytown", "CA", 12345);
        String expected = "123 Main St\nAnytown, CA 12345";
        assertEquals(expected, address.toString());
    }

    @Test
    public void testComesBeforeWithLowerZipCode() {
        Address address1 = new Address(123, "Main St", "Anytown", "CA", 12345);
        Address address2 = new Address(456, "Second St", "Othertown", "NY", 67890);
        assertTrue(address1.comesBefore(address2));
    }

    @Test
    public void testComesBeforeWithHigherZipCode() {
        Address address1 = new Address(123, "Main St", "Anytown", "CA", 67890);
        Address address2 = new Address(456, "Second St", "Othertown", "NY", 12345);
        assertFalse(address1.comesBefore(address2));
    }

    @Test
    public void testComesBeforeWithEqualZipCode() {
        Address address1 = new Address(123, "Main St", "Anytown", "CA", 12345);
        Address address2 = new Address(456, "Second St", "Othertown", "NY", 12345);
        assertFalse(address1.comesBefore(address2));
    }
}
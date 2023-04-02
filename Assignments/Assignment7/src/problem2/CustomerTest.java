package problem2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testMailCheck() {
        Customer customer = new Customer("John Doe", "123 Main St.", 12345);
        String expected = "check has been mailed to John Doe to the address 123 Main St. and number 12345";
        assertEquals(expected, customer.mailCheck());
    }

    @Test
    public void testSetName() {
        Customer customer = new Customer("John Doe", "123 Main St.", 12345);
        customer.setName(null);
        assertEquals("", customer.getName());
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    public void testSetAddress() {
        Customer customer = new Customer("John Doe", "123 Main St.", 12345);
        customer.setAddress(null);
        assertEquals("", customer.getAddress());
        customer.setAddress("456 Oak St.");
        assertEquals("456 Oak St.", customer.getAddress());
    }

    @Test
    public void testSetNumber() {
        Customer customer = new Customer("John Doe", "123 Main St.", 12345);
        assertEquals(12345, customer.getNumber());
        customer.setNumber(67890);
        assertEquals(67890, customer.getNumber());
    }
}

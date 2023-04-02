package problem2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {
    @Test
    public void testGetAccountNumber() {
        long expectedAccountNumber = 123456789;
        Account account = new Account("John Doe", "123 Main St", 123, expectedAccountNumber);
        Assertions.assertEquals(expectedAccountNumber, account.getAccountNumber());
    }

    @Test
    public void testSetAccountNumber() {
        long expectedAccountNumber = 987654321;
        Account account = new Account("Jane Doe", "456 Oak Ave", 456, 123456789);
        account.setAccountNumber(expectedAccountNumber);
        Assertions.assertEquals(expectedAccountNumber, account.getAccountNumber());
    }

    @Test
    public void testMailCheck() {
        String expectedMailCheck = "check has been mailed to John Doe to the address 123 Main St and number 123\nAccount Number: 123456789";
        Account account = new Account("John Doe", "123 Main St", 123, 123456789);
        Assertions.assertEquals(expectedMailCheck, account.mailCheck());
    }
}

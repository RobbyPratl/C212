
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void testPrintShape() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.printShape();
    }

    @Test
    public void testGetShape() {
        Rectangle rectangle = new Rectangle(3, 3);
        String expected = "***\n***\n***";
        assertEquals(expected, rectangle.getShape());

        Rectangle rectangle2 = new Rectangle(2, 4);
        String expected2 = "****\n****";
        assertEquals(expected2, rectangle2.getShape());

        Rectangle rectangle3 = new Rectangle(4, 2);
        String expected3 = "**\n**\n**\n**";
        assertEquals(expected3, rectangle3.getShape());
    }
}

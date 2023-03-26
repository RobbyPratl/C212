
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void testPrintShape() {
        Triangle triangle = new Triangle(3);
        triangle.printShape();
    }

    @Test
    public void testGetShape() {
        Triangle triangle = new Triangle(4);
        String expected = "*\n**\n***\n****";
        assertEquals(expected, triangle.getShape());

        Triangle triangle2 = new Triangle(3);
        String expected2 = "*\n**\n***";
        assertEquals(expected2, triangle2.getShape());

        Triangle triangle3 = new Triangle(2);
        String expected3 = "*\n**";
        assertEquals(expected3, triangle3.getShape());

    }
}
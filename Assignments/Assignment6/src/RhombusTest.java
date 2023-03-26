import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class RhombusTest {
    @Test
    public void testPrintShape() {
        Rhombus rhombus = new Rhombus(5);
        rhombus.printShape();
    }

    @Test
    public void testGetShape() {
        Rhombus rhombus = new Rhombus(3);
        String expected = " *\n***\n *";
        assertEquals(expected, rhombus.getShape());

        Rhombus rhombus2 = new Rhombus(5);
        String expected2 = "  *\n ***\n*****\n ***\n  *";
        assertEquals(expected2, rhombus2.getShape());

        Rhombus rhombus3 = new Rhombus(7);
        String expected3 = "   *\n  ***\n *****\n*******\n *****\n  ***\n   *";
        assertEquals(expected3, rhombus3.getShape());
    }

    @Test
    public void testRhombusConstructor() {
        Rhombus rhombus = new Rhombus(3);
        assertEquals(3, rhombus.getHeight());
    }

    @Test
    public void testRhombusConstructorWithEvenNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rhombus(4);
        });
    }
}

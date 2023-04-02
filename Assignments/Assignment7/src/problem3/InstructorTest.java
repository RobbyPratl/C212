package problem3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class InstructorTest {
    @Test
    void testGetPerformance() {
        Instructor instructor1 = new Instructor("John Doe", "Excellent");
        assertEquals(5.0, instructor1.getPerformance());

        Instructor instructor2 = new Instructor("Jane Smith", "Good");
        assertEquals(4.0, instructor2.getPerformance());

        Instructor instructor3 = new Instructor("Bob Johnson", "Average");
        assertEquals(3.0, instructor3.getPerformance());

        Instructor instructor4 = new Instructor("Alice Brown", "Bad");
        assertEquals(2.0, instructor4.getPerformance());

        Instructor instructor5 = new Instructor("Tom Wilson", "Worst");
        assertEquals(1.0, instructor5.getPerformance());

        // Test case for invalid rating
        Instructor instructor6 = new Instructor("Kate Lee", "Unknown");
        assertEquals(0.0, instructor6.getPerformance());
    }
}

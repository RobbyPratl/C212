package problem3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void testGetPerformanceWithAPlusGrade() {
        Student student = new Student("John Doe", "A+");
        double expectedPerformance = 4.0;
        double actualPerformance = student.getPerformance();
        assertEquals(expectedPerformance, actualPerformance, 0.01);
    }

    @Test
    void testGetPerformanceWithBMinusGrade() {
        Student student = new Student("Jane Doe", "B-");
        double expectedPerformance = 2.7;
        double actualPerformance = student.getPerformance();
        assertEquals(expectedPerformance, actualPerformance, 0.01);
    }

    @Test
    void testGetPerformanceWithNullGrade() {
        Student student = new Student("James Bond", null);
        double expectedPerformance = 0.0;
        double actualPerformance = student.getPerformance();
        assertEquals(expectedPerformance, actualPerformance, 0.01);
    }

    @Test
    void testGetPerformanceWithInvalidGrade() {
        Student student = new Student("Jack Smith", "Z");
        double expectedPerformance = 0.0;
        double actualPerformance = student.getPerformance();
        assertEquals(expectedPerformance, actualPerformance, 0.01);
    }

}

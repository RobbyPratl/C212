import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void testGetName() {
        Student student = new Student("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testAddQuiz() {
        Student student = new Student("Jane Smith");
        student.addQuiz(90);
        assertEquals(90, student.getTotalScore());
        assertEquals(1, student.getNumQuizzesTaken());
    }

    @Test
    public void testGetTotalScore() {
        Student student = new Student("Alice Johnson");
        student.addQuiz(80);
        student.addQuiz(85);
        assertEquals(165, student.getTotalScore());
    }

    @Test
    public void testGetAverageScore() {
        Student student = new Student("Bob Brown");
        student.addQuiz(70);
        student.addQuiz(75);
        assertEquals(72.5, student.getAverageScore(), 0.001);
    }

    @Test
    public void testGetNumQuizzesTaken() {
        Student student = new Student("Sarah Lee");
        student.addQuiz(95);
        student.addQuiz(100);
        assertEquals(2, student.getNumQuizzesTaken());
    }

    @Test
    public void testGetAverageScoreWithNoQuizzesTaken() {
        Student student = new Student("Tom Smith");
        assertEquals(0.0, student.getAverageScore(), 0.001);
    }
}

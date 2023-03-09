package Labs.Lab08.Question_Ex;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumericQuestionTest {
    @Test
    public void testCheckAnswer() {
        NumericQuestion nq = new NumericQuestion("What is the square root of 16?", "4.0");
        assertTrue("Correct answer is marked as incorrect", nq.checkAnswer("4.0"));
        assertTrue("Answer within tolerance is marked as incorrect", nq.checkAnswer("4.01"));
        assertFalse("Incorrect answer is marked as correct", nq.checkAnswer("5.0"));
        assertFalse("Non-numeric response is marked as correct", nq.checkAnswer("four"));
    }
}

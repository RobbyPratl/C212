package Labs.Lab08.Question_Ex;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class QuestionTest {
    @Test
    public void testDisplay() {
        Question q = new Question("What is the capital of France?", "Paris");
        assertEquals("What is the capital of France?", q.getText());
    }

    @Test
    public void testCheckAnswer() {
        Question q = new Question("What is the capital of France?", "Paris");
        assertTrue("Correct answer is marked as incorrect", q.checkAnswer("Paris"));
        assertFalse("Incorrect answer is marked as correct", q.checkAnswer("London"));
    }
}

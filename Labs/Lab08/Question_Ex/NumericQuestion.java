package Labs.Lab08.Question_Ex;

public class NumericQuestion extends Question {
    public NumericQuestion(String text, String answer) {
        super(text, answer);
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseNum = Double.parseDouble(response);
            double answerNum = Double.parseDouble(answer);
            return Math.abs(responseNum - answerNum) <= 0.01;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

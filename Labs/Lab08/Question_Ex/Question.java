package Labs.Lab08.Question_Ex;

public class Question {
    private String text;
    protected String answer; // we'll see why protected later

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public void display() {
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void getQuestion() {
        System.out.println(text);
    }

}

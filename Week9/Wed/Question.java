public class Question {
    private String text;
    private String answer;

    // constructors
    public Question() {
        text = "";
        answer = "";
    }

    // setters
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    // display the ans and text
    // This is not a good way of doing but to teach us why we will show
    public void display() {
        System.out.println(text);
    }

    public boolean checkAnswer(String str) {
        return answer.equalsIgnoreCase(str);
    }

}

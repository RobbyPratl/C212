public class Question {

    // instance variables
    private String text;
    private String answer;

    // constructors
    public Question(){
        text = "";
        answer = "";
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

    // display the question
    public void display(){
        System.out.println(text);
    }

    // check correct answer
    public boolean checkAnswer(String str){
        return this.answer.equalsIgnoreCase(str);
    }


}

import java.util.ArrayList;

public class ChoiceQuestion extends Question{

    // instance variables
    ArrayList<String> choices;

    // constructor
    public ChoiceQuestion(int numOfChoices){
        choices = new ArrayList<>(numOfChoices);
    }

    public void addChoice(String choice, boolean correct){
        choices.add(choice);
        if(correct)
            setAnswer(choice);
    }

    @Override
    public void display() {
        super.display();
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(choices.get(i));
        }
    }
}

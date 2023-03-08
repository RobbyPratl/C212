import java.util.ArrayList;

public class ChoiceQ extends Question {
    ArrayList<String> choices;

    // constructor
    public ChoiceQ(int numOfChoices) {
        choices = new ArrayList<>(numOfChoices);
    }

    public void addChoice(String choice, boolean correct) {
        choices.add(choice);
        if (correct)
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

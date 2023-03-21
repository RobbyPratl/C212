import java.util.Scanner;

public class QuestionTester {

    public static void main(String[] args) {

        Question q1 = new Question();
        q1.setText("what is the meaning of life");
        q1.setAnswer("42");

        q1.display();
        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();
        System.out.println(q1.checkAnswer(ans));
    }
}

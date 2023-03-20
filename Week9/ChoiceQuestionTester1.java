import java.util.Scanner;

public class ChoiceQuestionTester1 {

    public static void main(String[] args) {

        ChoiceQuestion cq1 = new ChoiceQuestion(4);
        cq1.setText("What is the meaning of life");
        cq1.addChoice("42", true);
        cq1.addChoice("0", false);
        cq1.addChoice("5", false);
        cq1.addChoice("52", false);

        ChoiceQuestion cq2 = new ChoiceQuestion(4);
        cq2.setText("When does the spring break starts");
        cq2.addChoice("thursday", false);
        cq2.addChoice("friday", false);
        cq2.addChoice("saturday", false);
        cq2.addChoice("sunday", true);

        presentQuestion(cq1);
        presentQuestion(cq2);

    }

    public static void presentQuestion(ChoiceQuestion cq1){
        cq1.display();
        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();
        System.out.println(cq1.checkAnswer(ans));

    }
}

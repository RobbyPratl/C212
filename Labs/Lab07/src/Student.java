public class Student {
    private String name;
    private int totalScore;
    private int numQuizzesTaken;

    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.numQuizzesTaken = 0;
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score) {
        totalScore += score;
        numQuizzesTaken++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverageScore() {
        if (numQuizzesTaken == 0) {
            return 0.0;
        }
        return (double) totalScore / numQuizzesTaken;
    }

    public int getNumQuizzesTaken() {
        return numQuizzesTaken;
    }
}

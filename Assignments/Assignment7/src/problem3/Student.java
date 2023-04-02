package problem3;

public class Student implements Performance {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        if (name == null) {
            return " ";
        } else {
            return name;
        }
    }

    public void setName(String newName) {

    }

    public String getGrade() {
        if (grade == null) {
            return "";
        } else {
            return grade;
        }
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public double getPerformance() {
        if (getGrade().equalsIgnoreCase("A+") | getGrade().equalsIgnoreCase("A")) {
            return 4.0;
        } else if (getGrade().equalsIgnoreCase("A-")) {
            return 3.7;
        } else if (getGrade().equalsIgnoreCase("B+")) {
            return 3.3;
        } else if (getGrade().equalsIgnoreCase("B")) {
            return 3.0;
        } else if (getGrade().equalsIgnoreCase("B-")) {
            return 2.7;
        } else if (getGrade().equalsIgnoreCase("C+")) {
            return 2.3;
        } else if (getGrade().equalsIgnoreCase("C")) {
            return 2.0;
        } else if (getGrade().equalsIgnoreCase("C-")) {
            return 1.7;
        } else if (getGrade().equalsIgnoreCase("D+")) {
            return 1.3;
        } else if (getGrade().equalsIgnoreCase("D")) {
            return 1.0;
        } else {
            return 0;
        }
    }

}

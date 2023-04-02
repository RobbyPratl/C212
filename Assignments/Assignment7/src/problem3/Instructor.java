package problem3;

public class Instructor implements Performance {
    private String name;
    private String rating;

    public Instructor(String name, String rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        if (name == null) {
            return " ";
        } else {
            return name;
        }
    }

    public void setName(String newName) {
        this.name = newName;

    }

    public String getRating() {
        if (rating == null) {
            return "";
        } else {
            return rating;
        }
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public double getPerformance() {
        if (getRating().equalsIgnoreCase("Excellent")) {
            return 5.0;
        } else if (getRating().equalsIgnoreCase("Good")) {
            return 4.0;
        } else if (getRating().equalsIgnoreCase("Average")) {
            return 3.0;
        } else if (getRating().equalsIgnoreCase("Bad")) {
            return 2.0;
        } else if (getRating().equalsIgnoreCase("Worst")) {
            return 1.0;
        } else {
            return 0;
        }
    }

}

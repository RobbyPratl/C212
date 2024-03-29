package problem1;

public class Passenger extends Person {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = (name != null) ? name : "";
    }

    public String getName() {
        if (name == null) {
            return " ";
        } else {
            return name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age <= 0) ? 0 : age;
    }

    @Override
    public String getDetails() {
        return "Name: " + name + "\n" + "Age: " + age;
    }
}

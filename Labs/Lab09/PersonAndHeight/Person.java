
public class Person implements Measurable {
    public String name;
    public int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public double getMeasure() {
        return height;
    }

    public String toString() {
        return name + " is " + height + " inches tall";
    }
}

public class Hourglass implements Timeable {
    @Override
    public String readTime() {
        return "Halfway empty";
    }

    public void flip() {
        System.out.println("Flipping the hourglass");
    }
}
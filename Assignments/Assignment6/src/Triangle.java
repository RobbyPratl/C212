
public class Triangle {
    private int length;

    public Triangle(int length) {
        this.length = length;
    }

    public void printShape() {
        if (length == 1) {
            System.out.println("*");
        } else {
            Triangle smallerTriangle = new Triangle(length - 1);
            smallerTriangle.printShape();
            System.out.println("*".repeat(length));
        }
    }

    public String getShape() {
        if (length == 1) {
            return "*";
        } else {
            Triangle smallerTriangle = new Triangle(length - 1);
            return smallerTriangle.getShape() + "\n" + "*".repeat(length);
        }
    }
}


public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void printShape() {
        if (width == 1) {
            System.out.println("*".repeat(height));
        } else {
            Rectangle smallerRectangle = new Rectangle(width - 1, height);
            smallerRectangle.printShape();
            System.out.println("*".repeat(height));
        }
    }

    public String getShape() {
        if (width == 1) {
            return "*".repeat(height);
        } else {
            Rectangle smallerRectangle = new Rectangle(width - 1, height);
            return smallerRectangle.getShape() + "\n" + "*".repeat(height);
        }
    }

}

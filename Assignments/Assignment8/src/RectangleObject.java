import java.awt.Graphics2D;
import java.awt.Color;

public class RectangleObject extends CollisionObject {
    private double width;
    private double height;
    private Color color;

    // public RectangleObject(double x, double y, double width, double height) {
    // super(x, y);
    // this.width = width;
    // this.height = height;
    // }

    // TEST SUBJECT

    public RectangleObject(double x, double y, double width, double height, Color color) {
        super(x, y);
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean collidesWith(CollisionObject other) {
        if (other instanceof RectangleObject) {
            RectangleObject r = (RectangleObject) other;
            return (x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y);
        } else {
            return false;
        }
    }

    @Override
    public void draw(Graphics2D g2d) {
        // g2d.setColor(new Color(0, 0, 255));
        g2d.setColor(color);
        g2d.fillRect((int) x, (int) y, (int) width, (int) height);
    }

}

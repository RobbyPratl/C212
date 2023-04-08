import java.awt.Color;
import java.awt.Graphics2D;

public class CircleObject extends CollisionObject {
    private int radius;
    private Color color;
    // public CircleObject(int x, int y, int radius) {
    // super(x, y);
    // this.radius = radius;
    // }

    // TEST SUBJECT

    public CircleObject(int x, int y, int radius, Color color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return 2 * radius;
    }

    public int getX() {
        return (int) x;
    }

    public int getY() {
        return (int) y;
    }

    @Override
    public boolean collidesWith(CollisionObject other) {
        if (other instanceof RectangleObject) {
            return other.collidesWith(this);
        } else if (other instanceof CircleObject) {
            CircleObject otherCircle = (CircleObject) other;
            int distance = distance(getX(), getY(), otherCircle.getX(), otherCircle.getY());
            return distance <= radius + otherCircle.getRadius();
        }
        return false;
    }

    private int distance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(getX() - radius, getY() - radius, getDiameter(), getDiameter());
        // g2d.drawOval(getX() - radius, getY() - radius, getDiameter(), getDiameter());
    }
}

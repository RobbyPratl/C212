import java.awt.Graphics2D;

public class CircleObject extends CollisionObject {
    // width and height fields
    private float radius;
    private float diameter;

    public CircleObject(float radius, float diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }

    // create the circle object
    public void draw(Graphics2D g2d) {
        g2d.drawOval((int) radius, (int) radius, (int) diameter, (int) diameter);
    }
}

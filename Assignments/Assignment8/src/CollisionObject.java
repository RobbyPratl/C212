import java.awt.Graphics2D;

public abstract class CollisionObject implements Drawable {
    protected double x;
    protected double y;

    public CollisionObject(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract boolean collidesWith(CollisionObject other);

    // Override this method to draw the object and add functionality to draw the
    // shapes
    public abstract void draw(Graphics2D g2d);
}

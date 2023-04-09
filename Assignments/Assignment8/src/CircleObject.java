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

    public CircleObject(double x, double y, int radius, Color color) {
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

    @Override
    public boolean collidesWith(CollisionObject other) {
        if (other instanceof CircleObject) {
            CircleObject c = (CircleObject) other;
            return (Math.pow(x - c.x, 2) + Math.pow(y - c.y, 2) < Math.pow(radius + c.radius, 2));
        } else {
            return false;
        }
    }

    @Override
    public void draw(Graphics2D g2d) {
        // g2d.setColor(new Color(0, 0, 255));
        g2d.setColor(color);
        g2d.fillOval((int) x - radius, (int) y - radius, radius * 2, radius * 2);
    }

    @Override
    public double ComputeDistance(double CameraX, double CameraY) {
        // double distance = Double.POSITIVE_INFINITY;

        // Point2D[] vertices = getVertices();
        // for (int i = 0; i < vertices.length; i++) {
        // Line2D segment = new Line2D.Double(vertices[i], vertices[(i + 1) %
        // vertices.length]);
        // double segmentDistance = segment.ptSegDist(CameraX, CameraY) - radius;
        // distance = Math.min(distance, segmentDistance);
        // }
        // return distance;

        return Math.sqrt(Math.pow(x - CameraX, 2) + Math.pow(y - CameraY, 2)) - radius;
    }

    // private Point2D[] getVertices() {
    // Point2D[] vertices = new Point2D[4];
    // vertices[0] = new Point2D.Double(x - radius, y - radius);
    // vertices[1] = new Point2D.Double(x + radius, y - radius);
    // vertices[2] = new Point2D.Double(x + radius, y + radius);
    // vertices[3] = new Point2D.Double(x - radius, y + radius);
    // return vertices;
    // }

}

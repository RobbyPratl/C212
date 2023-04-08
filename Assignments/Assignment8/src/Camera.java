import java.awt.Graphics2D;

public class Camera implements Drawable {
    private double x;
    private double y;

    public Camera(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g2d) {
        // TODO Auto-generated method stub

    }

}

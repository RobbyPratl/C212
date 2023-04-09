import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Displays and updates the logic for the top-down raymarcher.
 */
public class RaymarcherPanel extends JPanel {

    /**
     * We need to keep a reference to the parent swing app for sizing and
     * other bookkeeping.
     */
    private final RaymarcherRunner raymarcherRunner;

    private List<CollisionObject> objects;
    Camera camera = new Camera(100, 100);

    public RaymarcherPanel(RaymarcherRunner raymarcherRunner) {
        this.raymarcherRunner = raymarcherRunner;
        this.setPreferredSize(new Dimension(this.raymarcherRunner.getFrame().getWidth(),
                this.raymarcherRunner.getFrame().getHeight()));

        objects = new ArrayList<CollisionObject>();
        Random rand = new Random();
        for (int i = 0; i < 7; i++) {
            int x = rand.nextInt(this.getPreferredSize().width);
            int y = rand.nextInt(this.getPreferredSize().height);
            int width = rand.nextInt(100);
            int height = rand.nextInt(100);
            // Assign random color to each rectangle
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            objects.add(new RectangleObject(x, y, width, height, color));
        }
        for (int i = 0; i < 7; i++) {
            int x = rand.nextInt(this.getPreferredSize().width);
            int y = rand.nextInt(this.getPreferredSize().height);
            int radius = rand.nextInt(100);
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            objects.add(new CircleObject(x, y, radius, color));
        }
        addMouseMotionListener(camera);
        addMouseListener(camera);
        // add the mouse press listener

    }

    // create the marching rays
    public ArrayList<March> marchs() {
        double x = this.camera.getX();
        double y = this.camera.getY();
        ArrayList<March> marches = new ArrayList<March>();

        while (x >= 0 && x <= this.getPreferredSize().width && y >= 0 && y <= this.getPreferredSize().height) {
            double closeDist = Double.MAX_VALUE;
            for (CollisionObject obj : objects) {
                double dist = obj.ComputeDistance(x, y);
                if (dist < closeDist) {
                    closeDist = dist;
                }
            }

            if (closeDist < 0.1) {
                break;
            }

            March march = new March(x, y, closeDist + x, y);
            marches.add(march);
            x += closeDist;
        }

        return marches;
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        // for (CollisionObject obj : objects) {
        // obj.draw(g2d);
        // }

        // camera.draw(g2d);

        double minDist = Double.MAX_VALUE;
        for (CollisionObject obj : objects) {
            double dist = obj.ComputeDistance(camera.getX(), camera.getY());
            if (dist < minDist) {
                minDist = dist;
            }
        }

        g2d.setColor(Color.red);
        g2d.drawOval((int) (camera.getX() - minDist * 2),
                (int) (camera.getY() - minDist * 2),
                (int) (minDist * 4), (int) (minDist * 4));

        // this draws the shapes dont touch
        for (CollisionObject obj : objects) {
            obj.draw(g2d);
        }

        ArrayList<March> marches = marchs();
        for (March march : marches) {
            march.draw(g2d);
        }
        camera.draw(g2d);

    }

    public void update() {
        this.repaint();
    }

    public List<CollisionObject> getObjects() {
        return objects;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setObjects(List<CollisionObject> objects) {
        this.objects = objects;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

}

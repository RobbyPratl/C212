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

    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());

        for (CollisionObject obj : objects) {

            obj.draw(g2d);
        }
    }
}

package Wed;

import java.awt.Graphics;

import javax.swing.JComponent;

public class barChart extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 10, 300, 400);
        g.fillRect(0, 20, 100, 400);
        g.fillRect(0, 30, 100, 50);
        g.fillRect(0, 40, 250, 100);

    }

}

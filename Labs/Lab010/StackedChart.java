package Labs.Lab010;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class StackedChart extends JComponent {
    private ArrayList<String> categories;
    private ArrayList<Integer> votes;

    private final int MAX_BAR_SIZE = 200;
    private final Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.ORANGE, Color.YELLOW };

    public StackedChart(ArrayList<String> categories, ArrayList<Integer> votes) {
        this.categories = categories;
        this.votes = votes;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.setColor(Color.BLACK);
        for (int i = 1; i <= 5; i++) {
            int y = i * height / 5;
            g.drawLine(0, y, width, y);
            g.drawString(i * 20 + "%", 5, y - 5);
        }

        int x = 50;
        for (int i = 0; i < categories.size(); i++) {
            String category = categories.get(i);
            double vote = votes.get(i);
            int barHeight = (int) (vote * MAX_BAR_SIZE);
            int y = height - barHeight;
            Color color = colors[i % colors.length];

            g.setColor(color);
            g.fillRect(x, y, 50, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(category, x + 5, height - 5);
            x += 70;
        }
    }
}

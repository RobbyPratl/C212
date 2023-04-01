package Labs.Lab010;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class StackedChart extends JComponent {
    private ArrayList<String> categories;
    private ArrayList<Integer> votes;
    private Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE, Color.MAGENTA };

    public StackedChart(ArrayList<String> categories, ArrayList<Integer> votes) {
        this.categories = categories;
        this.votes = votes;
        setPreferredSize(new Dimension(400, 300));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int xMargin = 50;
        int yMargin = 50;
        int graphWidth = width - 2 * xMargin;
        int graphHeight = height - 2 * yMargin;

        int totalVotes = 0;
        for (int vote : votes) {
            totalVotes += vote;
        }

        int y = yMargin;
        for (int i = 0; i < categories.size(); i++) {
            int vote = votes.get(i);
            String category = categories.get(i);
            int barHeight = (int) ((double) vote / totalVotes * graphHeight);
            g.setColor(colors[i % colors.length]);
            g.fillRect(xMargin, y, graphWidth, barHeight);
            g.setColor(Color.BLACK);
            g.drawString(category, xMargin + graphWidth + 10, y + barHeight / 2);
            y += barHeight;
        }

        // Draw percentage markers
        g.setColor(Color.BLACK);
        for (int i = 0; i <= 10; i += 2) {
            int yCoord = yMargin + i * graphHeight / 10;
            g.drawLine(xMargin - 5, yCoord, xMargin, yCoord);
            // invert the numbers
            g.drawString(String.format("%d%%", 100 - i * 10), xMargin - 30, yCoord + 5);
        }
    }
}
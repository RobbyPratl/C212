package Labs.Lab010;

import java.util.ArrayList;
import javax.swing.JFrame;

public class StackedChartDisplay {
    public static void display(String title, ArrayList<String> categories, ArrayList<Integer> votes) {
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(600, 400);

        StackedChart chart = new StackedChart(categories, votes);
        frame.add(chart);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

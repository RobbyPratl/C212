package Mon;

import javax.swing.*;

public class FilledFrame {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        // Creating a frame object
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Title
        frame.setTitle("This is a frame with button and label");
        frame.setVisible(true);

        // Button and label
        JButton button = new JButton("Click me!");
        JLabel label = new JLabel("Hello World");

        JPanel panel = new JPanel();

        panel.add(button);
        panel.add(label);

        frame.add(panel);

    }
}

package Mon;

import javax.swing.*;

public class FilledFrame2 extends JFrame {

    // instance var
    // components
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private final int FRAME_WIDTH = 300;
    private final int FRAME_HEIGHT = 400;

    public FilledFrame2() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        button = new JButton("Click me!");
        label = new JLabel("Hello World");

        JPanel panel = new JPanel();

        panel.add(button);
        panel.add(label);

        add(panel);
    }

}

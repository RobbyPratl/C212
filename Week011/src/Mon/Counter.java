package Mon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Counter extends JFrame {

    private int count;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private final int FRAME_WIDTH = 300;
    private final int FRAME_HEIGHT = 400;

    public Counter() {
        count = 0;
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        button = new JButton("Click me!");
        label = new JLabel("Hello World");

        JPanel panel = new JPanel();
        button.addActionListener(new ClickListener());
        panel.add(button);
        panel.add(label);

        add(panel);
    }

    private class ClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            label.setText(count + "");

            // System.out.println("Button clicked " + count + " times");
        }
    }
}
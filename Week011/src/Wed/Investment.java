package Wed;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Investment extends JFrame {
    private JPanel panel;
    private final double INTITAL_BALANCE = 1000;
    private JButton button;
    private JLabel label;
    private int years;
    private double rate;

    private JLabel rateLabel;
    private JLabel yearsLabel;
    private JLabel result;

    private JTextField rateField;
    private JTextField yearsField;

    private final int FRAME_WIDTH = 300;
    private final int FRAME_HEIGHT = 400;

    public Investment() {
        createComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents() {
        button = new JButton("Calculate!");
        rateLabel = new JLabel("Rate: ");
        yearsLabel = new JLabel("Years: ");
        result = new JLabel("Result");

        panel = new JPanel();
        button.addActionListener(new ClickListener());
        panel.add(button);
        panel.add(label);
        panel.add(rateField);
        panel.add(yearsLabel);
        panel.add(yearsField);
        panel.add(rateLabel);
        panel.add(result);

        add(panel);
    }

    private class ClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double balance = INTITAL_BALANCE;
            rate = Double.parseDouble(rateField.getText()) / 100;
            years = Integer.parseInt(yearsField.getText());

            for (int i = 0; i < years; i++) {
                balance += balance + rate;
            }
            result.setText(years + " " + balance);
        }
    }
}

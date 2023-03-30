package Labs.Lab010;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class PollTracking {
    private static ArrayList<String> categories = new ArrayList<>();
    private static ArrayList<Integer> votes = new ArrayList<>();
    private static JLabel vanillaLabel;
    private static JLabel chocolateLabel;
    private static JLabel otherLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);
        frame.setTitle("Favorite Ice Cream Flavor");

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        frame.add(mainPanel);

        JPanel votingPanel = new JPanel();
        votingPanel.setLayout(new FlowLayout());
        mainPanel.add(votingPanel);

        JButton vanillaButton = new JButton("Vanilla");
        vanillaButton.addActionListener(new VoteButtonListener("Vanilla"));
        votingPanel.add(vanillaButton);

        JButton chocolateButton = new JButton("Chocolate");
        chocolateButton.addActionListener(new VoteButtonListener("Chocolate"));
        votingPanel.add(chocolateButton);

        JTextField customField = new JTextField(10);

        votingPanel.add(customField);

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.Y_AXIS));
        mainPanel.add(labelPanel);

        vanillaLabel = new JLabel("Vanilla: 0");
        labelPanel.add(vanillaLabel);

        chocolateLabel = new JLabel("Chocolate: 0");
        labelPanel.add(chocolateLabel);

        otherLabel = new JLabel("Other: ");
        labelPanel.add(otherLabel);

        JPanel createGraphPanel = new JPanel();
        createGraphPanel.setLayout(new FlowLayout());
        mainPanel.add(createGraphPanel);

        JButton graphButton = new JButton("Display Graph");
        graphButton.addActionListener(new GraphButtonListener(frame));
        createGraphPanel.add(graphButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static class VoteButtonListener implements ActionListener {
        private String flavor;

        public VoteButtonListener(String flavor) {
            this.flavor = flavor;
            categories.add(flavor);
            votes.add(0);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int index = categories.indexOf(flavor);
            votes.set(index, votes.get(index) + 1);
            updateLabels();
        }
    }

    private static class GraphButtonListener implements ActionListener {
        private JFrame frame;

        public GraphButtonListener(JFrame frame) {
            this.frame = frame;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            for (Component comp : frame.getContentPane().getComponents()) {
                disableComponents(comp);
            }

        }

        private void disableComponents(Component comp) {
            if (comp instanceof Container) {
                for (Component child : ((Container) comp).getComponents()) {
                    disableComponents(child);
                }
            }
            comp.setEnabled(false);
        }
    }

    private static void updateLabels() {
        vanillaLabel.setText("Vanilla: " + votes.get(categories.indexOf("Vanilla")));
        chocolateLabel.setText("Chocolate: " + votes.get(categories.indexOf("Chocolate")));
        StringBuilder otherText = new StringBuilder("Other: ");
        for (int i = 2; i < categories.size(); i++) {
            otherText.append(categories.get(i)).append(": ").append(votes.get(i));
            if (i < categories.size() - 1) {
                otherText.append(", ");
            }
        }
        otherLabel.setText(otherText.toString());
    }
}
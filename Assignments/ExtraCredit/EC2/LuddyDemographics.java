package Assignments.ExtraCredit.EC2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LuddyDemographics {
    public static void main(String[] args) {
        // Initialize the main things such as the window, title, size of window
        JFrame frame = new JFrame();
        frame.setSize(450, 450);
        frame.setTitle("Luddy Student Body");

        // Creating the panel to add objects to it
        JPanel mainPanel = new JPanel();
        JLabel label = new JLabel();

        JComboBox<String> comboBox = new JComboBox<>();
        mainPanel.add(comboBox);

        // adding the names of the subjects to the combo box
        comboBox.addItem("Choose...");
        comboBox.addItem("Computer Science");
        comboBox.addItem("Cybersecurity and Global Policy");
        comboBox.addItem("Data Science");
        comboBox.addItem("Informatics");
        comboBox.addItem("Intelligent Systems Engineering");
        comboBox.addItem("All Undergraduate Degrees");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

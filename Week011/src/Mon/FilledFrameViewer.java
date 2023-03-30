package Mon;

import javax.swing.JFrame;

public class FilledFrameViewer {
    public static void main(String[] args) {

        FilledFrame2 frame = new FilledFrame2();
        frame.setTitle("This is from Filled Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

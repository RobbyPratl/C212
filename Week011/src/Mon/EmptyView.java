package Mon;

import javax.swing.JFrame;

public class EmptyView {

    public static void main(String[] args) {

        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        // Creating a frame object
        JFrame frame = new JFrame();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        frame.setTitle("This is an empty frame");
        frame.setVisible(true);

    }

}

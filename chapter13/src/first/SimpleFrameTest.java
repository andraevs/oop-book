package first;

import javax.swing.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        SimpleFrame frame = new SimpleFrame();
        frame.setVisible(true);
    }
}
class SimpleFrame extends JFrame {

    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

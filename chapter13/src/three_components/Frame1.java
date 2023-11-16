package three_components;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame {
    private JTextField text;
    private JButton button1, button2;

    public Frame1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());
        text = new JTextField(20);
        add(text);
        button1 = new JButton("Save");
        add(button1);
        button1.setLabel("Save as");
        button2 = new JButton("Cancel");
        add(button2);
    }

    public static void main(String args[]) {
        Frame1 fr1 = new Frame1();
        fr1.setVisible(true);
    }
}

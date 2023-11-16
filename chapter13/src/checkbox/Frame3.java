package checkbox;

import javax.swing.*;
import java.awt.*;

public class Frame3 extends JFrame {
    public Frame3() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 100);
        setLayout(new FlowLayout());
        add(new JCheckBox("one",true));
        add(new JCheckBox("two"));
        add(new JCheckBox("three"));
        JRadioButton j4=new JRadioButton("four");
        JRadioButton j5=new JRadioButton("five");
        JRadioButton j6=new JRadioButton("six");
        ButtonGroup bg=new ButtonGroup();
        bg.add(j4); bg.add(j5); bg.add(j6);
        add(j4); add(j5); add(j6);
    }
    public static void main(String args[]) {
        Frame3 fr = new Frame3();
        fr.setVisible(true);
    }
}

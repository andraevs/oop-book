package slider;

import javax.swing.*;
import java.awt.*;
import java.util.Hashtable;

public class Frame5 extends JFrame {
    public Frame5() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 100);
        setLayout(new FlowLayout());
        int min=0;
        int max=100;
        int init =50;
        JLabel label=new JLabel("Horizontal slider");
        add(label);
        JSlider slider1=new JSlider(JSlider.HORIZONTAL,min,max,init);
        slider1.setMajorTickSpacing(25);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        Hashtable labels=new Hashtable();
        labels.put(25,new JLabel("1/4"));
        labels.put(50,new JLabel("1/2"));
        labels.put(75,new JLabel("3/4"));
        slider1.setLabelTable(labels);
        add(slider1);
    }
    public static void main(String args[]) {
        Frame5 fr = new Frame5();
        fr.setVisible(true);
    }
}

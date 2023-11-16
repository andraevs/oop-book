package text_area;

import javax.swing.*;

public class Frame2 extends JFrame {
    JTextArea tArea;

    public Frame2() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        tArea=new JTextArea(10,20);
        add(tArea);
        tArea.setText("Hi");
        tArea.append("John");
        tArea.insert(" ",2);
        tArea.replaceRange("Mary",3,7);
    }
    public static void main(String args[]) {
        Frame2 fr = new Frame2();
        fr.setVisible(true);
    }
}

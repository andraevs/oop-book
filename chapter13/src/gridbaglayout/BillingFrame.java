package gridbaglayout;

import javax.swing.*;
import java.awt.*;

public class BillingFrame extends JFrame {
    private JButton print, cancel, printF, archive;
    private JTextArea area;
    private JPanel p;
    private GridBagLayout gb;
    private GridBagConstraints gbc;

    public BillingFrame() {
        super("Bill");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        gb = new GridBagLayout();
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.NORTH;
        p = new JPanel();
        p.setLayout(gb);
        area = new JTextArea(10, 20);
        area.setEditable(false);
        addConstraints(area, 0, 0, 2, 5);
        p.add(area);
        print = new JButton("Print");
        addConstraints(print, 0, 2, 1, 1);
        p.add(print);
        cancel = new JButton("Cancel");
        addConstraints(cancel, 1, 2, 1, 1);
        p.add(cancel);
        printF = new JButton("PrintF");
        addConstraints(printF, 2, 2, 1, 1);
        p.add(printF);
        archive = new JButton("Archive");
        addConstraints(archive, 3, 2, 1, 1);
        p.add(archive);
        add(p);
    }

    public void addConstraints(Component c, int line, int col, int width, int height) {
        gbc.gridx = col;
        gbc.gridy = line;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        gb.setConstraints(c, gbc);
    }

    public static void main(String[] args) {
        BillingFrame myFrame = new BillingFrame();
        myFrame.setVisible(true);
    }
}


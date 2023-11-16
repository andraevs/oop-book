package menus;

import javax.swing.*;

public class Frame6 extends JFrame {

    public Frame6() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 300);
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("File");
        JMenuItem mi1 = new JMenuItem("New Project");
        m.add(mi1);
        JMenuItem mi2 = new JMenuItem("Open Project");
        m.add(mi2);
        JMenu m1 = new JMenu("Import project");
        JMenuItem mi3 = new JMenuItem("Import as ZIP");
        m1.add(mi3);
        JMenuItem mi4 = new JMenuItem("Import as Eclipse project");
        m1.add(mi4);
        m.add(m1);
        m.addSeparator();
        JMenuItem exit = new JMenuItem("Exit");
        m.add(exit);
        mb.add(m);
        setJMenuBar(mb);
    }
    public static void main(String[] args) {
        Frame6 fr = new Frame6();
        fr.setVisible(true);
    }
}

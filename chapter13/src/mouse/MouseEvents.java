package mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvents extends JFrame implements MouseListener {
    TextArea ta;
    public MouseEvents(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        JPanel cv = new JPanel();
        cv.addMouseListener(this);
        add(cv);
        ta = new TextArea(20, 40);
        add(ta);
    }
    public void mouseClicked(MouseEvent e) {
        ta.append("Click the mouse. x=" + e.getX() + " y=" + e.getY() + "\n");
    }
    public void mouseEntered(MouseEvent e) {
        ta.append("Mouse entered. x=" + e.getX() + " y=" + e.getY() + "\n");
    }
    public void mouseExited(MouseEvent e) {
        ta.append("Mouse exited. x=" + e.getX() + " y=" + e.getY() + "\n");
    }
    public void mousePressed(MouseEvent e) {
        ta.append("Mouse pressed. x=" + e.getX() + " y=" + e.getY() + "\n");
    }
    public void mouseReleased(MouseEvent e) {
        ta.append("Mouse released. x=" + e.getX() + " y=" + e.getY() + "\n");
    }
    public static void main(String[] args) {
        Frame f = new MouseEvents("Demo");
        f.setBounds(40, 60, 450, 350);
        f.setVisible(true);
    }
}

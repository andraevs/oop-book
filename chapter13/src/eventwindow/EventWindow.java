package eventwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventWindow extends JFrame implements ActionListener {
    JTextField text;
    JButton button1, button2;
    JTextArea ta;
    public EventWindow(String title){
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        text = new JTextField(20);
        add(text, BorderLayout.NORTH);
        JPanel p = new JPanel();
        button1 = new JButton ("Save");
        p.add(button1);
        button1.addActionListener(this);
        button2 = new JButton ("Cancel");
        p.add(button2);
        button2.addActionListener(this);
        add(p, BorderLayout.SOUTH);
        ta = new JTextArea(20, 40);
        add(ta, BorderLayout.CENTER);
    }

    public void actionPerformed (ActionEvent evt){
        String arg = evt.getActionCommand();
        if (evt.getSource() instanceof JButton){
            if (arg.equals("Save")) {
                ta.append(text.getText());
                text.setText(null);
            }
            else
                ta.setText(null);
        }
    }
    public static void main(String[] args) {
        JFrame f = new EventWindow("Demo");
        f.setBounds(40, 60, 450, 350);
        f.setVisible(true);
    }
}


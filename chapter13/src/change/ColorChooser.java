package change;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class ColorChooser extends JFrame{
    private JSlider r,g,b;
    private JTextField rt,gt,bt;
    private JPanel p;
    private MyPanel canvas;
    private GridBagLayout gb;
    private GridBagConstraints gbc;
    private EventController a;
    Color c=Color.BLACK;
    public ColorChooser(){
        super("ColorChooser");
        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,2));
        a=new EventController ();
        p=new JPanel();
        gb=new GridBagLayout();
        gbc=new GridBagConstraints();
        gbc.fill=GridBagConstraints.NONE;
        gbc.anchor=GridBagConstraints.WEST;
        gbc.insets=new Insets(10,10,0,0);
        p.setLayout(gb);
        r=new JSlider(JSlider.VERTICAL, 0, 255, 0);
        addComp (r,0,0,1,1);
        r.addChangeListener(a);
        rt=new JTextField(5);
        addComp(rt,0,1,1,1);
        g=new JSlider(JSlider.VERTICAL, 0, 255, 0);
        addComp(g,1,0,1,1);
        g.addChangeListener(a);
        gt=new JTextField(5);
        addComp(gt,1,1,1,1);
        b= new JSlider(JSlider.VERTICAL, 0, 255, 0);
        addComp(b,2,0,1,1);
        b.addChangeListener(a);
        bt=new JTextField(5);
        addComp(bt,2,1,1,1);
        canvas=new MyPanel();
        add(p);
        add(canvas);
        setVisible(true);
        gt.setText("0");
        rt.setText("0");
        bt.setText("0");
    }
    public void addComp(Component c, int l, int col, int width, int height){
        gbc.gridx=col;
        gbc.gridy=l;
        gbc.gridwidth=width;
        gbc.gridheight=height;
        gb.setConstraints(c,gbc);
        p.add(c);
    }
    class EventController implements ChangeListener {
        public void stateChanged(ChangeEvent e){
            int red=r.getValue();
            int green=g.getValue();
            int blue=b.getValue();
            rt.setText(String.valueOf(red));
            gt.setText(String.valueOf(green));
            bt.setText(String.valueOf(blue));
            c=new Color(red,green,blue);
            canvas.repaint();
        }
    }

    class MyPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(c);
            g.fillOval(0,310,150,150);
    }}
    public static void main(String[] arg){
        JFrame f=new ColorChooser();
    }
}


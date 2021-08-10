package anonymous;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame {
  Button bExit;
  public MyFrame(){
    setSize(100,100);
    setLayout(new FlowLayout());
    bExit = new Button("Exit");
    add(bExit);
    setVisible(true);
    bExit.addActionListener(e -> System.exit(0));
  }

  public static void main(String[] args) {
    MyFrame myFrame = new MyFrame();
  }
}

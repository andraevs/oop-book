package list;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Frame4 extends JFrame {

    public Frame4() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setLayout(new FlowLayout());
        DefaultListModel listModel = new DefaultListModel();
        listModel.addAll(List.of("Item 1", "Item 2", "Item 3","Item 4","Item 5"));
        JList list1 = new JList(listModel);
        list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list1.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        JScrollPane listScroller = new JScrollPane(list1);
        add(listScroller);
        listScroller.setPreferredSize(new Dimension(100, 80));
    }

    public static void main(String args[]) {
        Frame4 fr = new Frame4();
        fr.setVisible(true);
    }
}

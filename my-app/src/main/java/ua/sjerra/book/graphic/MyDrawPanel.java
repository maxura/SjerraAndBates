package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Natalya on 07.02.2015.
 */
public class MyDrawPanel extends JPanel {
    public static void main(String[] args) {
        new MyDrawPanel().go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new MyDrawPanel());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(20, 50, 100, 100);
    }
}

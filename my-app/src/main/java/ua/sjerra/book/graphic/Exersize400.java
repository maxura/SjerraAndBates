package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by nata on 08.02.2015.
 */
public class Exersize400 {
    JButton button;
JPanel jPanel;
    public static void main(String[] args) {
      new  Exersize400().go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        jPanel = new JPanel();
        frame.add(jPanel);
        frame.getContentPane().add(BorderLayout.NORTH,button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

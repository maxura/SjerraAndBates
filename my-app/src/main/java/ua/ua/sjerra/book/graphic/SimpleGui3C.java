package ua.ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by nata on 08.02.2015.
 */
public class SimpleGui3C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        new SimpleGui3C().go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("change colors");
        button.addActionListener(this);
        CircleOnBalckBackground drawPanel = new CircleOnBalckBackground();
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }
}

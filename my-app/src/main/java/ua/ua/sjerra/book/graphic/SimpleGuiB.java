package ua.ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Natalya on 07.02.2015.
 */
public class SimpleGuiB implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        SimpleGuiB gui = new SimpleGuiB();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        button.setText("I've been clicked");
    }
}

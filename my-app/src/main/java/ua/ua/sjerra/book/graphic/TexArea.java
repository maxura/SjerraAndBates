package ua.ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by maxura on 14.12.2015.
 */
public class TexArea {

    public static void main(String[] args) {
        TexArea txtArea = new TexArea();
        txtArea.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JTextArea jArea = new JTextArea(10,20);
        jArea.setText("dfsdfdsfsf");
        jArea.selectAll();
        panel.add(jArea);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        frame.setVisible(true);
    }
}

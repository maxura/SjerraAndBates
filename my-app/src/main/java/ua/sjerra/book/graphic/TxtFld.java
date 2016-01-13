package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by maxura on 14.12.2015.
 */
public class TxtFld {
    public static void main(String[] args) {
        TxtFld txtField = new TxtFld();
        txtField.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JTextField jfield = new JTextField();
        jfield.setText("dfsdfdsfsf");
        jfield.selectAll();
        panel.add(jfield);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        frame.setVisible(true);
    }


}

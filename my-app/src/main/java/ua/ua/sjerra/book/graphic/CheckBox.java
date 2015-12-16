package ua.ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by maxura on 16.12.2015.
 */
public class CheckBox implements ActionListener{
    JCheckBox checkBox = new JCheckBox();
    public static void main(String[] args) {
        CheckBox chkBox = new CheckBox();
        chkBox.go();
    }
    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        checkBox.addActionListener(this);
        panel.add(checkBox);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String state = "";
        if (checkBox.isSelected())
            state="cheked";
        else state = "unchecked";
        System.out.println(state);
    }
}

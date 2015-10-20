package ua.sjerra.book.graphic.imrove.skils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by maxura on 21.10.2015.
 */
public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        JButton button = new JButton("shock me");
        JButton buttoTwo = new JButton("bliss");
        JButton buttoThree = new JButton("huh");
        panel.add(button);
        panel.add(buttoTwo);
        panel.add(buttoThree);
        frame.getContentPane().add(BorderLayout.EAST,panel);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}

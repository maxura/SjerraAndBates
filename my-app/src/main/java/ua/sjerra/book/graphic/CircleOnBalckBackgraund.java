package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Natalya on 07.02.2015.
 */
public class CircleOnBalckBackgraund extends JPanel {
    public static void main(String[] args) {
        new CircleOnBalckBackgraund().go();
    }


    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new CircleOnBalckBackgraund());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(10,10,100,100);
    }
}

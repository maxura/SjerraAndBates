package ua.ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mmusienko on 2/11/15.
 */
public class GradientWithRandomColors extends JPanel {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new GradientWithRandomColors());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red, green, blue);
        GradientPaint gradientPaint = new GradientPaint(70, 70, startColor, 200, 200, endColor);
        g2D.setPaint(gradientPaint);
        g2D.fillOval(70, 70, 100, 100);
    }
}

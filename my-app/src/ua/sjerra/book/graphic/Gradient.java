package sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mmusienko on 2/11/15.
 */
public class Gradient extends JPanel {
    public static void main(String[] args) {
        new Gradient().go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.add(new Gradient());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(30, 30, Color.blue, 150, 150, Color.orange);
        g2D.setPaint(gradient);
        g2D.fillOval(70, 70, 150, 150);
    }
}

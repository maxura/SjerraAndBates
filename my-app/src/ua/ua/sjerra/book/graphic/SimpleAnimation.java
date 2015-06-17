package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by mmusienko on 2/19/15.
 */
public class SimpleAnimation extends JPanel {
    JFrame frame = new JFrame();
    int x = 70;
    int y = 70;

    public static void main(String[] args) throws InterruptedException {
        new SimpleAnimation().go();
    }

    public void go() throws InterruptedException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.setSize(600, 600);

        frame.getContentPane().add(drawPanel);
        frame.setVisible(true);
        for (int i = 0; i < 130; i++) {
            x++;
            y++;
            drawPanel.repaint();
            Thread.sleep(200);

        }
    }


    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.orange);
            g.fillOval(x, y, 100, 100);
        }
    }


}

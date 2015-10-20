package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**GuidedTourFromFileTest
 * Created by mmusienko on 2/19/15.
 */
public class SimpleAnimatiomnWithFix {
    JFrame frame = new JFrame();
    int x = 500;
    int y = 70;

    public static void main(String[] args) throws InterruptedException {
        new SimpleAnimatiomnWithFix().go();
    }

    public void go() throws InterruptedException {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.setSize(600, 600);
        frame.getContentPane().add(drawPanel);
        frame.setVisible(true);
        for (int i = 0; i < 170; i++) {
            x-=3;
            //y+=3;
            drawPanel.repaint();
            Thread.sleep(100);
        }
    }


    class MyDrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.orange);
            g.fillOval(x, y, 100, 100);
        }
    }

}

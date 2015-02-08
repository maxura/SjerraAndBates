package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Natalya on 07.02.2015.
 */
public class ImageSample extends JPanel{
    public static void main(String[] args) {
        new ImageSample().go();
    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new ImageSample());
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
       Image image = new ImageIcon("g:\\Rastr\\Fantasy\\TOM KIRK\\75tcal_08.jpg").getImage();
        g.drawImage(image,3,4, this);
    }
}

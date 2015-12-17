package ua.ua.sjerra.book.graphic;

import javax.sound.midi.Sequence;
import javax.sound.midi.Track;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by maxura on 18.12.2015.
 */
public class BeatBox {
    JPanel mainPAnel;
    ArrayList<JCheckBox> checkBoxList;
    Sequence sequence;
    Track track;
    JFrame theFrame;
    String[] instrumentNames = {"Bass Dram", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic share", "Crash Cymbal", "Hand Clap", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }
    public  void buildGUI(){
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel backGround =new JPanel(layout);
        backGround.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        checkBoxList = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);
        JButton stop = new JButton("Stop");
        start.addActionListener(new MysStopListener());
    }
    public class MyStartListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //buildTrackAndStart();
        }
    }
    public class MysStopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            //sequncer.stop();
        }
    }
}

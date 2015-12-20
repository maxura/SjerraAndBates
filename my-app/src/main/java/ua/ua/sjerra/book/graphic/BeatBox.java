package ua.ua.sjerra.book.graphic;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
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
    JPanel mainPanel;
    ArrayList<JCheckBox> checkBoxList;
    Sequence sequence;
    Sequencer sequencer;
    Track track;
    JFrame theFrame;
    String[] instrumentNames = {"Bass Dram", "Closed Hi-Hat", "Open Hi-Hat", "Acoustic share", "Crash Cymbal", "Hand Clap", "Cowbell", "Vibraslap", "Low-mid Tom", "High Agogo", "Open Hi Conga"};
    int[] instruments = {35, 42, 46, 38, 49, 39, 50, 60, 70, 72, 64, 56, 58, 47, 67, 63};

    public static void main(String[] args) {
        new BeatBox().buildGUI();
    }

    public void buildGUI() {
        theFrame = new JFrame("Cyber BeatBox");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel backGround = new JPanel(layout);
        backGround.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        checkBoxList = new ArrayList<JCheckBox>();

        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListener());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        start.addActionListener(new MysStopListener());
        buttonBox.add(stop);

        JButton upTempo = new JButton("Up tempo");
        start.addActionListener(new MysStopListener());
        buttonBox.add(upTempo);

        JButton downTempo = new JButton("Tempo Down");
        start.addActionListener(new MysStopListener());
        buttonBox.add(downTempo);

        Box nameBox = new Box(BoxLayout.Y_AXIS);
        for (int i = 0; i < 16; i++) {
            nameBox.add(new Label(instrumentNames[i]));
        }

        backGround.add(BorderLayout.EAST, buttonBox);
        backGround.add(BorderLayout.WEST, nameBox);

        theFrame.getContentPane().add(backGround);
        GridLayout grid = new GridLayout(16, 15);
        grid.setVgap(1);
        grid.setHgap(2);

        mainPanel = new JPanel(grid);
        backGround.add(BorderLayout.CENTER, mainPanel);

        for (int i = 0; i < 256; i++) {
            JCheckBox c = new JCheckBox();
            c.setSelected(false);
            checkBoxList.add(c);
            mainPanel.add(c);
        }

        setUpMidi();
        theFrame.setBounds(50, 50, 300, 300);
        theFrame.pack();
        theFrame.setVisible(true);
    }

    public void setUpMidi() {
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequence = new Sequence(Sequence.PPQ, 4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(120);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void buildTrackAndStart() {
        int[] trackList = null;
        sequence.deleteTrack(track);
        track = sequence.createTrack();
        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instruments[i];
            for (int j = 0; j < trackList.length; j++) {
               JCheckBox jc = (JCheckBox) checkBoxList.get(j+(16*i));
                if (jc.isSelected()){
                    trackList[j]=key;
                }
                else {
                    trackList[j] = 0;
                }
            }

        }
    }


    public class MyStartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //buildTrackAndStart();
        }
    }

    public class MysStopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //sequncer.stop();
        }
    }
}

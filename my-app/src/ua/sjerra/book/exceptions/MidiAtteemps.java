package sjerra.book.exceptions;

import javax.sound.midi.*;

/**
 * Created by Natalya on 06.06.2015.
 */
public class MidiAtteemps {
    public static void main(String[] args) {
        MidiAtteemps mini = new MidiAtteemps();
        mini.play();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 10, 102, 100);


            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 10, 44, 100);
            MidiEvent noteOf = new MidiEvent(b, 16);
            track.add(noteOf);
            player.setSequence(seq);
            player.start();


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
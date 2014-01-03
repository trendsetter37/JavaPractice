/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstjava;

import javax.sound.midi.*;

/**
 *
 * @author javis
 */
public class MusicTest1 {

    public static void main(String[] args) {

        MusicTest1 mt = new MusicTest1();
        mt.play();

    }

    void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ, 4);

            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        } catch (InvalidMidiDataException e) {

            e.printStackTrace();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();

        }

    }//close play();

} //close class

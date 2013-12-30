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

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();

            System.out.println("We got a sequencer!");
        } catch (MidiUnavailableException e) {
            System.out.println("Sequencer not working");
            e.getMessage();
            // e.printStackTrace();
        }
    } //close play

    public static void main(String[] args) {

        MusicTest1 mt = new MusicTest1();

        mt.play();

    } //close main

} //close class

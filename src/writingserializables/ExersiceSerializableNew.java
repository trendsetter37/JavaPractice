/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writingserializables;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author javis
 */
public class ExersiceSerializableNew {

    public static void main(String... args) {
        //create serializable list

        List<String> quarks = Arrays.asList(
                "up", "down", "strange", "charm", "top", "bottom");

        //serialize the list
        try (
                OutputStream file = new FileOutputStream("quarks.ser");
                OutputStream buffer = new BufferedOutputStream(file);
                ObjectOutputStream object = new ObjectOutputStream(buffer);) {
            object.writeObject(quarks);
        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform output.", ex);
        }

        //de-serialize that b***
        try (
                InputStream file = new FileInputStream("quarks.ser");
                InputStream buffer = new BufferedInputStream(file);
                ObjectInput input = new ObjectInputStream(buffer);) {
            //de-serialize the list
            List<String> recoveredQuarks = (List<String>) input.readObject();

            //display the data
            for (String rQ : recoveredQuarks) {

                System.out.println("A quark condition could be: " + rQ);

            }

        } catch (ClassNotFoundException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.", ex);

        } catch (IOException ex) {
            fLogger.log(Level.SEVERE, "Cannot perform input.", ex);
        }
    }
    private static final Logger fLogger
            = Logger.getLogger(ExersiceSerializableNew.class.getPackage().getName());
}

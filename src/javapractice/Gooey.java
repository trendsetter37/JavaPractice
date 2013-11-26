/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author javis
 */
public class Gooey extends JFrame {

    private JTextField tf;
    private JCheckBox boldbox;
    private JCheckBox italicbox;

    public Gooey() {

        super("The title");
        setLayout(new FlowLayout());
        tf = new JTextField("This is a Sentence", 20);
        tf.setFont(new Font("Serif", Font.PLAIN, 14));
        add(tf);

        boldbox = new JCheckBox("Bold");
        add(boldbox);
        italicbox = new JCheckBox("italic");
        add(italicbox);

        HandlerClass1 handler = new HandlerClass1();
        boldbox.addItemListener(handler);
        italicbox.addItemListener(handler);

    }

    private class HandlerClass1 implements ItemListener {

        public void itemStateChanged(ItemEvent event) {

            Font font = null;

            if (boldbox.isSelected() && italicbox.isSelected()) {

                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);

            } else if (boldbox.isSelected()) {

                font = new Font("Serif", Font.BOLD, 14);

            } else if (italicbox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            
            tf.setFont(font);

        }

    }

}
//put in main class to test
/**
 *  Gooey lo = new Gooey();
        
        lo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lo.setVisible(true);
        lo.setSize(500, 500);
 */
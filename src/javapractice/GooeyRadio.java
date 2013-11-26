/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author javis
 */
public class GooeyRadio extends JFrame {

    private JTextField tf;
    private Font pf;
    private Font bf;
    private Font itf;
    private Font bif;

    private JRadioButton ppf;
    private JRadioButton bbf;
    private JRadioButton ittf;
    private JRadioButton biff;
    private ButtonGroup group;

    public GooeyRadio() {

        super("Radio boy");
        setLayout(new FlowLayout());

        tf = new JTextField("Cool dude", 25);
        add(tf);

        ppf = new JRadioButton("plain", true);
        bbf = new JRadioButton("bold", false);
        ittf = new JRadioButton("italic", false);
        biff = new JRadioButton("bold & italic", false);
        add(ppf);
        add(bbf);
        add(ittf);
        add(biff);

        group = new ButtonGroup();
        group.add(ppf);
        group.add(bbf);
        group.add(ittf);
        group.add(biff);

        pf = new Font("Serif", Font.PLAIN, 14);
        bf = new Font("Serif", Font.BOLD, 14);
        itf = new Font("Serif", Font.ITALIC, 14);
        bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        tf.setFont(pf);

        ppf.addItemListener(new HandlerClass(pf));
        bbf.addItemListener(new HandlerClass(bf));
        ittf.addItemListener(new HandlerClass(itf));
        biff.addItemListener(new HandlerClass(bif));

    }

    public class HandlerClass implements ItemListener {

        private Font font;

        //the font object gets variable font
        public HandlerClass(Font f) {
            font = f;

        }
//sets to the font object passed int
        public void itemStateChanged(ItemEvent event) {

            tf.setFont(pf);

        }

    }
}

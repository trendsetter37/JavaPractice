/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

/**
 *
 * @author javis
 */
// Event Handler demonstration
public class GUI3 extends JFrame {

    private JTextField item1;
    private JTextField item2;
    private JTextField item3;
    private JPasswordField psswdField;

    public GUI3() {

        super("The Title");
        setLayout(new FlowLayout());
        item1 = new JTextField(10);
        add(item1);

        item2 = new JTextField("Enter text here");
        add(item2);

        item3 = new JTextField("uneditable", 20);
        item3.setEditable(false);
        add(item3);

        psswdField = new JPasswordField("mypass");
        add(psswdField);

        TheHandler handler = new TheHandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        psswdField.addActionListener(handler);

    }

    private class TheHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            String string = "";

            if (event.getSource() == item1) {

                string.format("field 1: %s", event.getActionCommand());

            } else if (event.getSource() == item2) {

                string.format("field 2: %s", event.getActionCommand());

            } else if (event.getSource() == item3) {

                string.format("field 3: %s", event.getActionCommand());

            } else if (event.getSource() == psswdField) {

                string.format("field psswd: %s", event.getActionCommand());

                JOptionPane.showMessageDialog(null, string);

            }
        }

    }

}
//add to main main class to test
/**
 *   GUI3 cool = new GUI3();
       cool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cool.setSize(500, 500);
       cool.setVisible(true);
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author javis
 */
public class MoarGUI extends JFrame {
    
    private final JButton button1;
    private final JButton custButton;
    
    public MoarGUI () {
    
    super("The Title");
    setLayout(new FlowLayout());
   
    button1 = new JButton("regular button");
    add(button1);
    
    Icon b = new ImageIcon();
    Icon x = new ImageIcon();
    
    b.getClass().getResource("java.png");
    x.getClass().getResource("java2.png");
    
    
    
    custButton = new JButton("Custom", b);
    custButton.setRolloverIcon(x);
    add(custButton);
    
    HandlerClass handler = new HandlerClass();
    
    button1.addActionListener(handler);
    custButton.addActionListener(handler);
    
    
    }
    private class HandlerClass implements ActionListener {
        @Override
        public void actionPerformed (ActionEvent event) {
        
        JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        
        }
    
    
    
    
    }
}

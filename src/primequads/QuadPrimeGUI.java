/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primequads;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author javis
 */
public class QuadPrimeGUI implements ActionListener {
JButton button;
    public static void main(String[] args) {

        QuadPrimeGUI gui = new QuadPrimeGUI();
        gui.go();}
    
    public void go() {
        JFrame frame = new JFrame();
         button = new JButton("Calculate Quads");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
    
    button.setText("calculating...");
    
    
    }
     

    
    
    
}

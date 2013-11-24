/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author javis
 */
public class GUI2 extends JFrame {
    
    private JLabel item1;
    
    public GUI2 (){
    
    super("The title bar");
    setLayout(new FlowLayout());
    
    item1 = new JLabel("This is a sentence");
    item1.setToolTipText("This will appear upon hover");
    add(item1);
    
    }
    
   /** Add this to main class to activate this tutorial
    *  GUI2 cool = new GUI2();
        
        cool.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cool.setSize(300,300);
        cool.setVisible(true);
    */
    
    
    
}

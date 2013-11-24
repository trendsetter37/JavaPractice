/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

import javax.swing.JFrame;

/**
 *
 * @author javis
 */
public class MoarGUITestDrive {
    
   public static void main(String[] args) {
   
   MoarGUI top = new MoarGUI();
       
       top.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       top.setSize(400, 400);
       top.setVisible(true);
       
   }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

//import javax.swing.JFrame;
import javax.swing.JFrame;

/**
 *
 * @author js0044
 */
public class MainClass extends JFrame {

    public static void main(String[] args) {

        
        GooeyRadio poo = new GooeyRadio();
        poo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        poo.setSize(300, 200);
        poo.setVisible(true);

    }

}

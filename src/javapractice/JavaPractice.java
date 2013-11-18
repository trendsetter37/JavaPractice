/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Random;

/**
 *
 * @author javis
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Time dock = new Time();

        System.out.println(dock.toMilitary());
        System.out.println(dock.toRegularTime());

        dock.setTime(15, 33, 56);

        System.out.println(dock.toMilitary());
        
        System.out.println(dock.toRegularTime());

    }

}

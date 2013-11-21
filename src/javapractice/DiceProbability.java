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
public class DiceProbability {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[] freq = new int[6];

        for (int i = 0; i < 1000; i++) {
            ++freq[ rnd.nextInt(6)];
        }
        System.out.println("Value\tNumerical Occurrence");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(i+1 + "\t" + freq[i]);
        }

    }
}

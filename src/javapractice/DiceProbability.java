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

        int[] freq = new int[7];

        for (int i = 1; i <= 1000; i++) {
            ++freq[1 + rnd.nextInt(6)];
        }
        System.out.println("Value\tNumerical Occurrence");
        for (int i = 1; i < freq.length; i++) {
            System.out.println(i + "\t" + freq[i]);
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author javis
 */
public class PhraseOMatic {

    public static void main(String[] args) {

        String[] firstWordList = {"age", "bedlum", "lunacy", "madness", "charge", "eighty"};
        String[] secondWordList = {"deal", "parents", "willing", "discipline", "teacher", "no"};
        String[] thirdWordList = {"year", "annual", "season", "trees"};

        //create random number generator
        Random rnd = new Random();

        //how long is each list?
        int firstLen = firstWordList.length;
        int secondLen = secondWordList.length;
        int thirdLen = thirdWordList.length;

    //create your random numbers based off of array length
       /* int rnd1 = (int) (Math.random() * firstLen);
        int rnd2 = (int) (Math.random() * secondLen);
        int rnd3 = (int) (Math.random() * thirdLen);*/
        int rnd1 = rnd.nextInt(firstLen);
        int rnd2 = rnd.nextInt(secondLen);
        int rnd3 = rnd.nextInt(thirdLen);

    //Build phrase
        String phrase = firstWordList[rnd1] + " " + secondWordList[rnd2] + " " + thirdWordList[rnd3];

    //Print phrase
        
        JOptionPane.showMessageDialog(null, "what we need is a: " + phrase);
        System.out.println("what we need is a: " + phrase);
       

    }

}

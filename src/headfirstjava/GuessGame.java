/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstjava;

import java.util.Random;

/**
 *
 * @author javis
 */
public class GuessGame {

    Random rnd = new Random();
    Player p0;
    Player p1;
    Player p2;
    int target = rnd.nextInt(9) + 1;

    int count0 = 0;
    int count1 = 0;
    int count2 = 0;

    public void startGame() {

        p0 = new Player("Jody");
        p1 = new Player("Jane");
        p2 = new Player("John");

        boolean p0isRight = false;
        boolean p1isRight = false;
        boolean p2isRight = false;

        p0.guess();
        p1.guess();
        p2.guess();

        if (p0.attempt == target) {
            count0++;
        }
        if (p1.attempt == target) {
            count1++;
        }
        if (p2.attempt == target) {
            count2++;
        }

        System.out.println("The target was: " + target);
        GameCont();
        // System.out.println("You will now all get four guesses.\n Chooses Wisely!");
        // GameCont();
    }

    public void GameCont() {

        for (int i = 1; i < 5; i++) {
            int target1 = rnd.nextInt(9) + 1;
            p0.guess1();
            p1.guess1();
            p2.guess1();
            if (p0.attempt == target1) {
                count0++;
            }
            if (p1.attempt == target1) {
                count1++;
            }
            if (p2.attempt == target1) {
                count2++;
            }

        }
        System.out.println("correct guesses in the second round are as follows:" + "\n");
        System.out.println(p0.name + " you guessed: " + count0 + " correctly" + "\n");
        System.out.println(p1.name + " you guessed: " + count1 + " correctly" + "\n");
        System.out.println(p2.name + " you guessed: " + count2 + " correctly" + "\n");

    }

}

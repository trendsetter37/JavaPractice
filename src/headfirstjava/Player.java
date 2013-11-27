/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstjava;

/**
 *
 * @author javis
 */
public class Player extends GuessGame {
GuessGame go = new GuessGame();
    public String name;

    public Player(String name) {
        this.name = name;

    }

    int attempt;

    public int guess() {

        attempt = go.rnd.nextInt(9) +1;
        System.out.println(name + " Your guess is: " + attempt + "\n");
        return attempt;

    }
    public int guess1() {

        attempt = go.rnd.nextInt(9) +1;
        
        return attempt;

    }

}

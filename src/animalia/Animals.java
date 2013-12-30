/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalia;

/**
 *
 * @author javis
 */
public abstract class Animals {

    //instance variables
    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;

    /**
     * behaviors or methods
     */
    public void makeNoise() {

        System.out.println("noise will ensue");
    }

    public void roam() {
    }

    public void sleep() {
    }

    public void eat() {
    }

}

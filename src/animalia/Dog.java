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
public class Dog extends Canine implements Pet{

    private int size;
    private String name;
    private String breed;

    
    @Override
    public void play() {}
    
    @Override
    public void beFriendly() {}
    
    
    public void bark() {

        System.out.println("Roof....Roof");

    }

    public void mySize() {

        System.out.println("Oh yea and My size is: " + size);

    }

    public String getName() {

        return name;

    }

    public void setName(String s) {

        name = s;

    }

    public int getSize() {

        return size;

    }

    public void setSize(int sy) {
        if (sy <= 100) {
            size = sy;
        } else {size = 0;}

    }

    public String getBreed() {

        return breed;

    }

    public void setBreed(String br) {

        if (br.length() <= 30) {
            breed = br;
        }

    }

}

//This is example is broken...scratch that. It is fixed now!

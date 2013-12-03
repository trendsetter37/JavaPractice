/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Illustrates some of the default values or placeholders that will be assigned 
//to instance variables in the PoorDog class
package headfirstjava;

/**
 *
 * @author javis
 */
public class PoorDogTestDrive {

    public static void main(String[] args) {

        PoorDog dog1 = new PoorDog();

        System.out.println("dog1 name is: " + dog1.getName());
        System.out.println("dog1 size is " + dog1.getSize());
        System.out.println("dog1 color is brown? " + dog1.getIsBrown());
        System.out.println("dog1 legDiameter is: " + dog1.getlegDiameter());

   //run the main method to see what the common default values are
        //for unset instance variables
    }

}

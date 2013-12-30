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
public class DogTest {

    public static void main(String[] args) {
        //Test code goes here

        Dog dog1 = new Dog();
        dog1.setName("Bart");

        //make dog array
        Dog[] myDogs = new Dog[3];

        //Let us put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // Now access the dogs and insert names
        myDogs[0].setName("Freddy");
        myDogs[1].setName("Jane");
        int szz = 0;
        for (Dog w : myDogs) {
            szz += 50;
            w.setSize(szz);

        }
       // System.out.println("The name of the Dog in slot 2 is: " + dog1.name + "\n");

        //NOw loop through the array and make all the dogs bark
        for (Dog x : myDogs) {

            x.bark();
            System.out.println(x.getName());
            System.out.println(x.getName() + " size is: " + x.getSize());

            System.out.println("");

        }

    }

}

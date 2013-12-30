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
public class AnimalsTest {

    public static void main(String[] args) {
        Animals[] sd = new Animals[5];
        Wolf e = new Wolf();

        e.makeNoise();

        e.roam();

        e.eat();

        e.sleep();

        sd[0] = new Dog();
        sd[1] = new Cat();
        sd[2] = new Wolf();
        sd[3] = new Lion();
        sd[4] = new Hippo();
        
        for (int i=0; i<sd.length; i++){
        
        sd[i].eat();
        System.out.println("");
        sd[i].makeNoise();
        System.out.println("");
        sd[i].sleep();
        
        }
    }

}

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
public class PetOwner {

    public void start() {

        Vet v = new Vet();
        Dog d = new Dog();

        Hippo h = new Hippo();

        v.giveShot(d);
        v.giveShot(h);

    }

}

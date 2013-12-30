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
public class Washer {

    Laundry laundry = new Laundry();

    public void foo() throws ClothingException {

        laundry.doLaundry();

    }
    
    public static void main (String[] args) throws ClothingException {
    Washer wash = new Washer();
    
    wash.foo();
    
    
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

/**
 *
 * @author javis
 */
public class Fatty {
    
    public void digest (Food x) {
    
    x.eat();
    
    }
    
}
// polymorphic arguments that work! Add to main class to test
/**
 *  Fatty bucky = new Fatty();
      Food fo = new Food();
      Food po = new PotPie2();
      Food to = new Tuna();
      bucky.digest(fo);
      bucky.digest(po);
      bucky.digest(to);
 */

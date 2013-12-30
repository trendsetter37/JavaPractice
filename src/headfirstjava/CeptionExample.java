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
/**
 * Errors are abound in this class simply because it is a proof of concept and
 * was never meant to function properly.
 *
 * This class should not work.
 *
 */
public class CeptionExample {

    public void takeRisk() throws BadException {

        if (abandonAllHope) {

            throw new BadException();

        }

    }

    public void crossFingers() {

        try {

            anObject.takeRisk();

        } catch (BadException ex) {

            ex.printStackTrace(;)
        }

    }

    public void doLaundry() throws ClothingException {
        /**
         * Can throw a number of exception that falls under the supertype of
         * Clothing.
         *
         * eg. PantsException, TeeShirtException, etc.
         *
         */

        try {
            laundry.doLaundry();

        } catch (TeeShirtException tex) {

            // recovery code
        } catch (PantsException pex) {

            // recovery code
        } catch (LingerieException lex) {

            //recovery code
        }

    }

    public void foo() throws ReallyBadException {
        //REally risky code to try
        //without try/catch block
        
        laundry.doLaundry();
        
        
    }

}

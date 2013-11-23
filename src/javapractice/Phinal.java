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
public class Phinal {

    private int sum;
    private final int NUMBERS;

    public Phinal(int x) {

        NUMBERS = x;

    }

    public void add() {

        sum += NUMBERS;

    }
    @Override
    public String toString (){
    
    return String.format("sum = %d\n", sum);
    
    }

}

//put this cod in your main class when you want to retry this code
 /* Phinal phinalObject = new Phinal(10);

        for (int i = 0; i < 5; i++) {
            
            phinalObject.add();
            System.out.printf("%s", phinalObject);
            

        }
*/

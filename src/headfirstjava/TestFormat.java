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
public class TestFormat {

    public static void main(String[] args) {

        System.out.printf("%,d", 1000000);
        System.out.println();

        //or
        String s = String.format("%,d", 1000000);
        System.out.println(s);
        

    }

}

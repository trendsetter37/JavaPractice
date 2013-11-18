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
public class ArraysInMethods {
     public static void main(String[] args) {
        int[] javis = {3, 4, 5, 6, 7};
        System.out.println("Before the change method!");
        for (int x : javis) {
            System.out.println(x);

        }
//Transform zee array
        change(javis);
        
        System.out.println("After the change method");
        for (int y : javis) {
            System.out.println(y);

        }

    }

    public static void change(int i[]) {

        for (int counter = 0; counter < i.length; counter++) {
            i[counter] += 5;
        }

    }
    
}

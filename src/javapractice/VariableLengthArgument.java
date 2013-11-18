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
public class VariableLengthArgument {

    public static void main(String[] args) {

        System.out.println(average(43, 56, 75, 8, 65, 88, 98));

    }

    public static int average(int... numbers) {

        int total = 0;

        for (int x : numbers) {
            total += x;

        }
        return total / numbers.length;

    }
}

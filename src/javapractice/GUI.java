/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import javax.swing.JOptionPane;

/**
 *
 * @author javis
 */
public class GUI {

    public static void main(String[] args) {

        String firstNumber = JOptionPane.showInputDialog("Enter first number");
        String secondNumber = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);

        int sum = num1 + num2;

        JOptionPane.showMessageDialog(null, "The answer is: " + sum, "The title", JOptionPane.PLAIN_MESSAGE);

    }
}

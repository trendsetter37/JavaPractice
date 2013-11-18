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
public class TableForMultiDimensionalArray {
    
     public static void main(String[] args) {
        int firstArray[][] = {{3, 4, 5, 6}, {5, 6, 7, 8}};
        int secondArray[][] = {{5, 22, 66, 33, 3}, {43}, {2, 66, 44, 66}};
        
        System.out.println("This is the first Array!");
        
        display(firstArray);
        
        System.out.println("This is the second Array!");
        
        display(secondArray);

    }

    public static void display(int x[][]) {

        for (int row = 0; row<x.length; row++) {

            for (int column = 0; column < x[row].length; column++) {

                System.out.print(x[row][column]+"\t");
                
                
            }
            System.out.println();

        }

    }

    
}

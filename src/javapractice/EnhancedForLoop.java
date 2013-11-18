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
public class EnhancedForLoop {
    
    public static void main(String[] args) {

     int[] javis = {3,4,5,6,7};
     int total =0;
     
     for (int i: javis){
     total += i;
     }
           System.out.println(total);    
       
    
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javapractice;

/**
 *
 * @author js0044
 */
public class BeerSong {
    
    
    public static void main(String[] args){
    int beers = 99;
    String word = " bottles";
    String phrase0 = "  of beer on the wall";
    String phrase1 = " of beer";
    String phrase2 = "take one down, pass it around";
    String phrase3 = "No more bottles of beer on the wall!";
    
    while ( beers > 0 ){
    
     if (beers == 1) word = "bottle";
     
     System.out.println(beers + word + phrase0);
     System.out.println(beers + word + phrase1);
     System.out.println(phrase2);
     
     beers--;
     
     if (beers > 0 ) {
     
     System.out.println(beers + word + phrase0);
         
     } else {System.out.println(phrase3);}
     
    


}
    
}
}

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
public class PotPie {
    private int month;
    private int day;
    private int year;
    
    public PotPie(int m, int d, int y){
    
     month = m;
     day = d;
     year = y;
     
     System.out.printf("The Constructor for this is%s\n", this);
        
    }
    
    public String toString(){
    
    return String.format("%d%d%d", month, day, year);
    }
    
}

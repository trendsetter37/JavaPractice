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
public enum Enum {
    
    jane("aunt", "42"),
    ted("inlaw", "55"),
    ashley("father-in-law", "65"),
    nicole("italian", "18"),
    candy("different", "13"),
    erin("yeah", "16");
    
    
    private final String desc;
    private final String year;
    
    Enum  (String description, String birthday) {
    
    desc = description;
    year = birthday;
    
    }
    
    public String getDesc(){
    
    return desc;
    }
    
    public String getYear(){
    
    return year;
    }
    
    
    
    
    
}

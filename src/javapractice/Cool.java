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
public class Cool {
    
    private String firstName;
    private String lastName;
    private static int members = 0;
    
    public Cool(String fn, String ln) {
    
    firstName = fn;
    lastName = ln;
    members++;
    System.out.printf("Constructor for %s %s, members in the club: %d\n", firstName, lastName, members);
    
    }
    
    public String getFirst(){
    
    return firstName;
    }
    
    public String getLast(){
    
    return lastName;
        
    }
    
    public static int getMembers(){
    
        return members;
    
    }
    
    
    
    
    
    
    
}

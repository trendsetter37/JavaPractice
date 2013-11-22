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
public class MainClass {

    private String name;
    private PotPie birthday;
    PotPie pp = new PotPie();

    public MainClass(String theName, PotPie theDate) {

        name = theName;
        birthday = theDate;

    }

    public String toString() {

        return String.format("My name is %s", "My Birthday is %s", name, birthday);

    }

    public static void main(String[] args) {

    }

}

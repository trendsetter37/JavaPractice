/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstjava;

/**
 *
 * @author javis
 */
public class MovieTest {
    //Test for movie class

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "Ghost";
        one.rating = 8;
        one.genre = "Thriller";

        Movie two = new Movie();
        two.title = "4th Density";
        two.genre = "realistic";
        two.rating = 10;
        two.playIt();

        Movie three = new Movie();
        three.title = "The third movie";
        three.genre = "crazy";
        three.rating = 7;

        Movie[] movies = {one, two, three};
        Movie week;

        for (Movie x : movies) {
            System.out.println(x.genre);
            
            System.out.println();
            System.out.println(x.title);

        }

    }
}

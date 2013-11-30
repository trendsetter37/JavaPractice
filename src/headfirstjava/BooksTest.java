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
public class BooksTest {

    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
       
        
        for (int i = 0; i<myBooks.length; i++) {
        myBooks[i] = new Books();
        
        }

        myBooks[0].title = "Beauty and the Beast";
        myBooks[1].title = "Cool beans";
        myBooks[2].title = "4th & 5th";

        myBooks[0].author = "jaybird";
        myBooks[1].author = "kay";
        myBooks[2].author = "booky";

        for (Books z : myBooks) {

            System.out.println("the title is: " + z.title );
            System.out.println("the author is: " + z.author + "\n");
            

        }

    }

}

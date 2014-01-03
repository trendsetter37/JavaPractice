/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primequads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author js0044
 *
 * prime quadruplets > 3 Take the form of {p, p+2, p+6, p+8} There should be 7
 * PQs before you hit 2000
 *
 * We will use System's nanoTime() method to keep track of duration
 *
 */
public class PrimeQuadruplets {

    int s;

    public PrimeQuadruplets() {
        s = 2000;
    }

    public PrimeQuadruplets(int n) {

        s = n;

    }

    int count = 0;

    public List<Integer> pList = new ArrayList<>();

    void primeAlgorithm() {

        for (int x = 4; x < s; x++) {
            // we are looking for prime quadruplets of the form
            // {p, p+2, p+6, p+8}
            int first = x;
            int second = x + 2;
            int third = x + 6;
            int fourth = x + 8;

            if (isPrime(x) && isPrime(x + 2) && isPrime(x + 6) && isPrime(x + 8)) {
                pList.add(first);
                // System.out.print(x + " ");
                pList.add(second);
                //System.out.print((x+2) + " ");
                pList.add(third);
                //  System.out.print((x+6) + " ");
                pList.add(fourth);
                //  System.out.print((x + 8) + " ");

                System.out.println(first + " " + second
                        + " " + third + " " + fourth
                );

                System.out.println(" ");

                count++;

            }

        }
        System.out.println(count + " Quadrupal Primes were found below " + s);
        System.out.println();
        System.out.println("There were " + pList.size() + " prime #'s added to the List!");
        //listPrime();

    }

    boolean isPrime(int s) {
        int n = s;
//check if int s is a multiple of 2
        if (n % 2 == 0) {
            return false;
        }
//if not then just check the odds

        for (int x = 3; x < n; x += 2) {

            if (n % x == 0) {
                return false;
            }

        }
        return true;
    }

    void listPrime() {
        // list four at a time
        //int o = pList.size();

        int count = 1;

        for (Integer c : pList) {
            // replace with do while loop

            if (count % 4 != 0 && count != 0) {
                System.out.print(c + " ");

            } else {
                System.out.print(c);
                System.out.println(" ");

            }
            count++;
        }
    }

}

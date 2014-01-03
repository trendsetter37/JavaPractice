/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primequads;

import static java.lang.System.nanoTime;

/**
 *
 * @author js0044
 */
public class TestClass {

    public static void main(String[] args) {

        PrimeQuadruplets b = new PrimeQuadruplets();
        long timeBefore = nanoTime();
        b.primeAlgorithm();
        long timeAfter = nanoTime();
        System.out.println();
        double timeLapse = ((timeAfter - timeBefore) / 1000) / 1000;
        System.out.println("It took " + timeLapse + " milliseconds to complete the algorithm for prime quadruplets");

        System.out.println("Now using for loop to list QuadPrimes");

        b.listPrime();

    }

}

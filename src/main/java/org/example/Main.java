package org.example;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Main {
    //I created a lmbda and stored it as a IntPredicate
    static IntPredicate isPrime = n -> {

        // Using this loop i cheked if its not a prime number and return true or false
        for (int i=2; i<=n/2; i++ ) {
            if (n%i==0) {
                return false;

            }


        }
        // if the pervous check fails its is a prime number
        return true;
    };

    public static void main(String[] args) {
        //print out the results
        System.out.println(isPrime.test(2003));


    }



}
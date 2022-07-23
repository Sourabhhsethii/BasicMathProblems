package com.dxsys.maths.prime;

import java.util.Scanner;

/**
 * Check Weather Number is prime or not?
 *
 */
public class CheckPrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int checkPrimeNumber = sc.nextInt();
        CheckPrimeNumber checkForPrimeNumber = new CheckPrimeNumber();
        System.out.println(checkForPrimeNumber.checkForPrimeNumber(checkPrimeNumber));
        System.out.println(checkForPrimeNumber.checkForPrimeNumberOptimized(checkPrimeNumber));
    }

    boolean checkForPrimeNumber(int number){

        boolean result = false;

        if( number == 1){
             result = false;
        }

        /**
         * Number of Iterations =  [2 - n]
         * T.C. -Big O - O(n)
         */
        for (int i = 2; i < number; i++) {
            if(number % i == 0){
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }

    boolean checkForPrimeNumberOptimized(int number){

        boolean result = false;

        if( number == 1){
            result = false;
        }

        /**
         * Number of Iterations =  [2 - n]
         * T.C. -Big O - O(n^1/2)
         */
        for (int i = 2; i*i < number; i++) {
            if(number % i == 0){
                result = false;
                break;
            }
            result = true;
        }
        return result;
    }

}

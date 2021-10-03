package com.dxsys.maths.bit;

import java.util.Scanner;

/**
 * Count Number of Bits Set in Given Number n
 */
public class CountSetBits {

    static public int countSetBits(int number){
        int count =0;
        while (number>0){

            if((number&1) == 1){
                count++;
            }
            number = number>>1;
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(countSetBits(number));
    }
}

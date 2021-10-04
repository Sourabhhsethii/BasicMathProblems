package com.dxsys.maths.bit;

import java.util.Scanner;

/*
ReverseBits
Reverse Bits
Problem Description

Reverse the bits of an 32 bit unsigned integer A.



Problem Constraints
0 <= A <= 232



Input Format
First and only argument of input contains an integer A.



Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.



Example Input
Input 1:

 0
Input 2:

 3


Example Output
Output 1:

 0
Output 2:

 3221225472


Example Explanation
Explanation 1:

        00000000000000000000000000000000
=>      00000000000000000000000000000000
Explanation 2:

        00000000000000000000000000000011
=>      11000000000000000000000000000000
 */
public class ReverseBits {

    // Brute Force Method
    public static long reverse(long a) {

        long rev = 0;
        for (int i = 0; i < 32; i++, a >>= 1)
            rev = (rev << 1) | (a & 1);
        return rev;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(reverse(a));
    }
}

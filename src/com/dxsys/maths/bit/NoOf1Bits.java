package com.dxsys.maths.bit;

import java.util.Scanner;

/*
Number of 1 Bits
Problem Description

Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
1 <= A <= 109

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Example Input
Input1:
11

Example Output
Output1:
3

Example Explanation
Explaination:
11 is represented as 1011 in binary.
 */
public class NoOf1Bits {

    public int numSetBits(int A) {
        int count =0;
        for (int i=A;i>0; i=i/2 ){
            if(!(i%2==0)){
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        NoOf1Bits obj = new NoOf1Bits();
        System.out.println(obj.numSetBits(size));
    }
}

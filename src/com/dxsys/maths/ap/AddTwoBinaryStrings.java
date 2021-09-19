package com.dxsys.maths.ap;

import java.util.Scanner;

/*
Add Binary Strings
Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"
b = "11"
Return a + b = "111".

100
11
1010110111001101101000
1000011011000000111100110

A : "1010110111001101101000"
B : "1000011011000000111100110"
The expected output for this testcase is:
1001110001111010101001110
 */
public class AddTwoBinaryStrings {
    public String addBinary(String A, String B) {


        String finalres = "";

        int i=A.length()-1;
        int j=B.length()-1;
        int sum = 0;

        while (i>=0 || j>=0 || sum == 1){


                sum = sum + ((i>=0)? A.charAt(i) - '0': 0);
                sum = sum + ((j>=0)? B.charAt(j) - '0': 0);
                finalres = (char) (sum%2 + '0') + finalres;

                sum = sum/2;
                i--;
                j--;
            }



        return finalres;
    }





    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        String binaryNumberOne = scanner.next();
        String binaryNumberTwo = scanner.next();

        AddTwoBinaryStrings obj= new AddTwoBinaryStrings();

        System.out.println(obj.addBinary(binaryNumberOne,binaryNumberTwo));
    }
}

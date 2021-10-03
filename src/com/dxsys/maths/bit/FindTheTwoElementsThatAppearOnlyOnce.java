package com.dxsys.maths.bit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

/**
 * Single Number III
 * Problem Description
 *
 * Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 *
 * Note: Output array must be sorted.
 *
 *
 *
 * Problem Constraints
 * 2 <= |A| <= 100000
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First argument is an array of interger of size N.
 *
 *
 *
 * Output Format
 * Return an array of two integers that appear only once.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 1, 2, 4]
 * Input 2:
 * 6 1 2 3 1 2 4
 * A = [1, 2]
 *
 *
 * 186 256 102 377186, 377
 *
 * Example Output
 * Output 1:
 *
 * [3, 4]
 * Output 2:
 *
 * [1, 2]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  3 and 4 appear only once.
 * Explanation 2:
 *
 *  1 and 2 appear only once.
 */
public class FindTheTwoElementsThatAppearOnlyOnce {

    public int[] solve(int[] A) {
        int[] resultArray = new int[2];
        int xoredNumber =0;

        // XOR All numbers;
        for (int i=0;i<A.length;i++){
            xoredNumber = xoredNumber ^ A[i];
        }

        int setBitPos = 0;
        for(int pos=0;pos<A.length;pos++){
            if(checkBitUsingRightShift(xoredNumber,pos)){
                setBitPos = pos;
                break;
            }
        }

        int set=0, unset=0;

        for (int i=0;i<A.length;i++){
            if(checkBitUsingRightShift(A[i],setBitPos)){
                set = set ^ A[i];
            } else {
                unset = unset ^ A[i];
            }
        }

        if(set>unset){
            resultArray[0] =  unset;
            resultArray[1] = set;
        } else {
            resultArray[0] = set;
            resultArray[1] = unset;
        }


        return resultArray;
    }

    public static Boolean checkBitUsingRightShift(int n, int i){
        if(((n>>i)&1) == 1){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        FindTheTwoElementsThatAppearOnlyOnce obj = new FindTheTwoElementsThatAppearOnlyOnce();
        System.out.println(Arrays.toString(obj.solve(a)));
    }
}

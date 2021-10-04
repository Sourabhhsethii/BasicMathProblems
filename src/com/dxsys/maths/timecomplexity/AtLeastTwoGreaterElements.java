package com.dxsys.maths.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Elements which have at-least two greater elements
Problem Description

You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.

NOTE: The result should have the order in which they are present in the original array.
 */
public class AtLeastTwoGreaterElements {

    public static void solve(int[] A) {

        int[] result = new int[A.length];
        for(int i=0;i<A.length;i++){
            int count =0;
            for(int j=0;j<A.length;j++){

                if(A[j]> A[i]){
                    count++;
                }

            }
            if(count>=2){
            System.out.println(A[i]);
            }
        }

    }


    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 2;
        a[1] = 1;
        a[2] = 8;
        a[3] = 3;
        a[4] = 4;
        solve(a);
    }
}

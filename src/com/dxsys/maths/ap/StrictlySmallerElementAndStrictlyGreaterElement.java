package com.dxsys.maths.ap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
Smaller and Greater
You are given an Array A of size N.

Find for how many elements, there is a strictly smaller element and a strictly greater element.

Input Format

Given only argument A an Array of Integers.
Output Format

Return an Integer X, i.e number of elements.

Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e6

Example Input:
    A = [1, 2, 3]

Example Output:
    1

Explanation:
    only 2 have a strictly smaller and strictly greater element, 1 and 3 respectively.
 */
public class StrictlySmallerElementAndStrictlyGreaterElement {

    public int solve(int[] A) {
        int count =0 ;
        A = bubbleSort(A);
        int smallest = A[0];
        int largest = A[A.length-1];

        for (int i=0;i<A.length;i++){
            if(smallest < A[i] && A[i]<largest){
                count = count +1;
            }
        }

        return count;
    }

    public static int[] bubbleSort(int[] arr){
        int temp = 0;


        for (int i=0;i<arr.length;i++){
            // every time will reduce the length by
            for (int j=1;j< arr.length - i;j++){
                // Swap Number if and only if adjacent elements are greater, it will provide in accending sorting order.
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        return arr;
    }



    public static void main(String[] args) {

        StrictlySmallerElementAndStrictlyGreaterElement obj = new StrictlySmallerElementAndStrictlyGreaterElement();
        int[] a = new int[29];
        a[0] = 913;
        a[1] = 440;
        a[2] = 865;
        a[3] = 72;
        a[4] = 612;
        a[5] = 445;
        a[6] = 101;
        a[7] = 994;
        a[8] = 356;
        a[9] = 91;
        a[10] = 461;
        a[11] = 930;
        a[12] = 583;
        a[13] = 448;
        a[14] = 543;
        a[15] = 170;
        a[16] =  333;
        a[17] = 107;
        a[18] = 425;
        a[19] = 73;
        a[20] = 172;
        a[21] = 416;
        a[22] = 899;
        a[23] = 826;
        a[24] = 659;
        a[25] = 561;
        a[26] = 314;
        a[27] = 25;
        a[28] = 110;
        System.out.println(obj.solve(a));

    }
}

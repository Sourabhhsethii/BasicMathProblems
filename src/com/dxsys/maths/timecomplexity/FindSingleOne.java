package com.dxsys.maths.timecomplexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Problem Description

Given an array of integers A, every element appears twice except for one. Find that single one.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?



Problem Constraints
2 <= |A| <= 2000000

0 <= A[i] <= INTMAX



Input Format
First and only argument of input contains an integer array A.



Output Format
Return a single integer denoting the single element.



Example Input
Input 1:

 A = [1, 2, 2, 3, 1]
Input 2:
5 1 2 2 3 1

 A = [1, 2, 2]
 3 1 2 2


Example Output
Output 1:

 3
Output 2:

 1


Example Explanation
Explanation 1:

3 occurs once.
Explanation 2:

1 occurs once.
 */
public class FindSingleOne {

    public int singleNumber(final List<Integer> A) {

        int result =0;
        for(int i=0;i<A.size();i++){
            result = result ^ A.get(i);
        }

        return  result;
    }

    public static void main(String[] args) {
        int n;
        FindSingleOne obj = new FindSingleOne();

        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++){
            num.add(input.nextInt());
        }
        System.out.println(obj.singleNumber(num));

    }
}

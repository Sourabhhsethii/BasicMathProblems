package com.dxsys.maths.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Adjacent Differences Array
 * Problem Description
 *
 * You are given an integer array A having N integers.
 *
 * You have to construct and return an array containing all the adjacent / consecutive element differences (A[i + 1] - A[i]) in the same order.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 *
 * 1 <= A[i] <= 109
 *
 *
 *
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 *
 * Output Format
 * Return an integer array.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [6, 2, 4, 4, 3]
 * Input 2:
 5
 6 2 4 4 3

 *  A = [2]
1
 2
 *
 * Example Output
 * Output 1:
 *
 *  [-4, 2, 0, -1]
 * Output 2:
 *
 *  []
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  A[1] - A[0] = 2 - 6 = -4
 *  A[2] - A[1] = 4 - 2 = 2
 *  A[3] - A[2] = 4 - 4 = 0
 *  A[4] - A[3] = 3 - 4 = -1
 *  ∴ Result Array = [-4, 2, 0, -1]
 * Explanation 2:
 *
 *  As there is only one element in the array, there are no adjacent element pairs. So, an empty integer array is returned.
 */
public class AdjacentDifferencesArray {

    public int[] solve(int[] A) {

        int arr[] = new int[A.length-1];

        if(A.length>1){
            for (int i=0;i<A.length-1;i++){
                arr[i] = A[i+1] - A[i];
            }
        } else {
            return arr;
        }
        return arr;
    }
    public static void main(String[] args) {
        AdjacentDifferencesArray obj= new AdjacentDifferencesArray();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(obj.solve(randomNumbers)));
    }
}

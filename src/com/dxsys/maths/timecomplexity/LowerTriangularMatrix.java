package com.dxsys.maths.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Lower Triangular Matrix
 * Problem Description
 *
 * You are given a N X N integer matrix A. You have to tell whether it is a lower triangular matrix or not.
 *
 * A square matrix is called lower triangular if all the entries above the main diagonal are zero. For any matrix P if elements P[i, j] = 0 (where j > i (1-based)).
 *
 *
 * Problem Constraints
 * 2 <= N <= 103
 *
 * -1000 <= A[i][j] <= 1000
 *
 *
 *
 * Input Format
 * First and only argument is a 2D integer matrix A.
 *
 *
 *
 * Output Format
 * Return 1 if A is a lower triangular matrix, else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [[1, 0, 0],
 *       [0, 0, 0],
 *       [-7, -8, 9]]
 * Input 2:
 3 3
 Right ->1 0 0 0 0 0 -7 -8 9
 Wrong ->1 0 0 0 0 0 -7 -8 9
 1 0 1 0 0 0 -7 -8 9
 *  A = [[0, 2],
 *       [0, 0]]
 *
 2 2
 0 2 0 0
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  As A[1][2], A[1][3] and A[2][3] are zero, it is a lower triangular matrix.
 * Explanation 2:
 *
 *  As A[1][2] is not equal to zero, it is not a lower triangular matrix.
 */
public class LowerTriangularMatrix {

    public int solve(final int[][] A) {
        int result =0;
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[i].length;j++){
                if(j>i ){
                    result += A[i][j];
                }
            }
        }
        if(result == 0){
            return 1;
        } else
            return 0;
    }
    public static void main(String[] args) {

        int n,m;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();

        int[][]  arr = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] =  input.nextInt();
            }
        }

        LowerTriangularMatrix obj = new LowerTriangularMatrix();
        System.out.println(obj.solve(arr));

    }
}

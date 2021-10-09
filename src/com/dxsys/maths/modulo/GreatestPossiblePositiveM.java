package com.dxsys.maths.modulo;

import java.util.Scanner;

/**
 * A, B and Modulo
 * Problem Description
 *
 * Given two integers A and B, find the greatest possible positive M, such that A % M = B % M.
 *
 *
 *
 * Problem Constraints
 * 1 <= A, B <= 109
 * A != B
 *
 *
 *
 * Input Format
 * The first argument given is the integer, A.
 * The second argument given is the integer, B.
 *
 *
 *
 * Output Format
 * Return an integer denoting greatest possible positive M.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = 1
 * B = 2
 * Input 2:
 *
 * A = 5
 * B = 10
 *
 *
 * Example Output
 * Output 1:
 *
 * 1
 * Output 2:
 *
 * 5
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * 1 is the largest value of M such that A % M == B % M.
 * Explanation 2:
 *
 * For M = 5, A % M = 0 and B % M = 0.
 * 6816621
 * 8157697
 *
 * No value greater than M = 5, satisfies the condition.
 */
public class GreatestPossiblePositiveM {

    // Brute Force Approach // T.C = O(n) & S.C = O(1)
    public static int solve(int A, int B) {
        int m=1;
        for(int i=Integer.MAX_VALUE;i>1;i--){
            if(A % i == B % i){
                m = i;
                break;
            }
        }
        return m;
    }

    // T.C = O(1) & S.C = O(1)
    public static int solveOptimize(int A, int B) {
        int m=1;

        // a mod m = b mod m
        // a - b  mod  m  = 0
        // a-b = k * m
        // (a - b)/m = k;
        // return k;

        if(A!=B){
            m = Math.abs(A-B);
        }

        return m;
    }

    public static void main(String[] args) {
        int n,m;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        System.out.println(solveOptimize(n,m));
    }
}

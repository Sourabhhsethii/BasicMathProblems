package com.dxsys.maths.bit;

import java.util.Scanner;

/**
 * Smallest XOR
 * Problem Description
 *
 * Given two integers A and B, find a number X such that A xor X is minimum possible, and the number of set bits in X equals B.
 *
 *
 *
 * Problem Constraints
 * 0 <= A <= 10^9
 * 0 <= B <= 30
 *
 *
 *
 * Input Format
 * First argument contains a single integer A. Second argument contains a single integer B.
 *
 *
 *
 * Output Format
 * Return a single integer X.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = 3
 *  B = 3
 * Input 2:
 *
 *  A = 15
 *  B = 2
 *
 *
 * Example Output
 * Output 1:
 *
 *  7
 * Output 2:
 *
 *  12
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  3 xor 7 = 4 which is minimum
 * Explanation 2:
 *
 *  15 xor 12 = 3 which is minimum
 */
public class SmallestXOR {

    // Brute Force Method
    public static int solve(int A, int B) {
        int x = 0;
        int count = 0;
        while (count < Integer.MAX_VALUE){
            x = count ^ A;
            if(countSetBits(x) == B){
                return x;
            }
            count++;
        }
    return x;
    }

    public static int solveWithMoreOptimalApproach(int A, int B) {

        int serBits = countSetBits(B);
        int ans =0;
        for(int i=30;i>=0;i--){
            int mask = 1<<i;
            if ((A & mask)>0 && serBits>0) {
                ans |= (1 << i);

                serBits--;
            }
        }
        return ans;
    }

    static public int countSetBits(int number){
        int count =0;
        while (number>0){

            if((number&1) == 1){
                count++;
            }
            number = number>>1;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(solve(a,b));
        System.out.println(solveWithMoreOptimalApproach(a,b));
    }
}

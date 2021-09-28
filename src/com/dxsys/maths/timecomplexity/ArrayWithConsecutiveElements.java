package com.dxsys.maths.timecomplexity;

import java.util.Scanner;

/**
 * Array with consecutive elements
 * Problem Description
 *
 * Given an array of positive integers A, check and return whether the array elements are consecutive or not.
 * NOTE: Try this with O(1) extra space.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 10^9
 *
 *
 *
 * Input Format
 * The only argument given is the integer array A.
 *
 *
 *
 * Output Format
 * Return 1 if the array elements are consecutive else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 2, 1, 4, 5]
 * Input 2:
 5
 3 2 1 4 5
 *  A = [1, 3, 2, 5]
 4
 1 3 2 5
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 */

// O(N^2)
public class ArrayWithConsecutiveElements {
    public int solve(int[] A) {
            int isConsecutive = 1;
        int max=0,min=A[0];
        for (int i=0;i<A.length;i++){
            if(max<A[i]){
                max = A[i];
            }
            if(min>A[i]){
                min = A[i];
            }
        }
            for (int j = min; j <= max; j++) {
                Boolean hasElement = false;
                for(int i=0;i<A.length;i++) {
                if(A[i] == j){
                    hasElement = true;
                }
            }
                if(!hasElement){
                    isConsecutive = 0;
                    break;
                }
        }
        return isConsecutive;
    }

    // O(N)
    public int solveOptimal(int[] A) {
        int isConsecutive = 0;
        int max=0,min=A[0];
        int arraySum = 0;
        for (int i=0;i<A.length;i++){
            arraySum = arraySum + A[i];
            if(max<A[i]){
                max = A[i];
            }
            if(min>A[i]){
                min = A[i];
            }
        }
        int minMaxSum = 0;
        for (int j = min; j <= max; j++) {
            minMaxSum = minMaxSum + j;
        }

        if(arraySum == minMaxSum){
            isConsecutive = 1;
        }
        return isConsecutive;
    }

    public int solveMoreOptimal(int[] A) {
        int isConsecutive = 0;

        A = sort(A);

        for(int i=0;i<A.length-1;i++){

            if(A[i] == (A[i+1]-1)){
                isConsecutive = 1;
            } else {
                isConsecutive = 0;
                break;
            }

        }

        return isConsecutive;
    }

    public static int[] sort(int[] arr){
        return sortQuickSort(arr,0,arr.length-1);
    }

    public static int[] sortQuickSort(int[] arr, int start, int end){
        if(start<end){
            int p  = partition(arr,start,end);
            sortQuickSort(arr,0,p-1);
            sortQuickSort(arr,p+1,end);
        }
        return arr;
    }

    public static int partition(int arr[], int start, int end){

        int pivot = arr[end];
        int p = start;

        for (int i=start;i<end;i++){
            if(arr[i]<= pivot){
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                p++;
            }
        }
        int temp = arr[p];
        arr[p] = arr[end];
        arr[end] =temp;

        return p;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayWithConsecutiveElements obj= new ArrayWithConsecutiveElements();
        System.out.println(obj.solveMoreOptimal(array));
    }
}

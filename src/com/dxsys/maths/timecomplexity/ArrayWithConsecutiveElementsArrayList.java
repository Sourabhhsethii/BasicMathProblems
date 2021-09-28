package com.dxsys.maths.timecomplexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayWithConsecutiveElementsArrayList {

    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int isConsecutive = 0;
        for(int i=0;i<A.size()-1;i++){

            if(A.get(i) == (A.get(i+1)-1)){
                isConsecutive = 1;
            } else {
                isConsecutive = 0;
                break;
            }

        }

        if(A.size() == 1){
            isConsecutive = 1;
        }
        return  isConsecutive;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++){
            num.add(input.nextInt());
        }
        ArrayWithConsecutiveElementsArrayList obj = new ArrayWithConsecutiveElementsArrayList();
        System.out.println(obj.solve(num));
    }
}

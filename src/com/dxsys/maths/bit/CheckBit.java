package com.dxsys.maths.bit;

import java.util.Scanner;

public class CheckBit {

    public static Boolean checkBitUsingRightShift(int n, int i){
        if(((n>>i)&1) == 1){
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int bitPostion = input.nextInt();
        System.out.println(checkBitUsingRightShift(number,bitPostion));
    }
}

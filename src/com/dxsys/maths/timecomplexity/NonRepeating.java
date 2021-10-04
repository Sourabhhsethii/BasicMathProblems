package com.dxsys.maths.timecomplexity;

import java.util.Scanner;

/**
 *  * Example Input
 *  * Input 1:
 *  *
 *  * A = [1, 2, 3, 1, 2, 4]
 *  * Input 2:
 *  * Enter size of an array: 6
 *  * 1 2 3 1 2 4
 *
 *  *Non Repeating element in array
 *    3 4
 */
public class NonRepeating {
    public void solve(int a[])
    {
        int count;
        int[] result = new int[a.length];
        System.out.println("Non Repeating element in array");

        for(int i=0;i<a.length;i++)
        {
            count=0;
            //initialise the for loop for checking the elenemnt which are not repeated)
            for (int j = 0; j < a.length; j++)
            {
                //check the condition if any number is same so
                //incre
                if(a[i]==a[j] && i!=j)
                    count++;
            }
            //if count became zero so print the current element
            if(count==0)
                System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[50];
        System.out.println("enter size of an array");
        int size=sc.nextInt();
        System.out.println("enter elements of an array");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        NonRepeating obj = new NonRepeating();
        //call the NonRepeating function
       obj.solve(a);
    }
}

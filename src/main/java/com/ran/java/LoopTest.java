package com.ran.java;

import java.util.Scanner;

/**
 * Created by ranjithrajd on 27/7/15.
 */
public class LoopTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int limit[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();
            limit[i]=scanner.nextInt();
            int result=0;
            for (int j=0;j<limit[i];j++){
                    result+=(Math.pow(2,j)*b[i]);
                    System.out.print(a[i] + result+" ");
            }
            System.out.println();
        }
    }
}

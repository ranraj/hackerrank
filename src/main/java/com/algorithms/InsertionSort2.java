package com.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Input
 * 5
 * 5 4 3 2 1
 */
public class InsertionSort2 {

    public static void insertIntoSorted(int[] a) {
        for (int i = 1; i < a.length ; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] < a[j - 1]){
                    swap(a, j, j - 1);
                }
            }
            printArray(a);
        }
    }

    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
        insertIntoSorted(ar);
        //printArray(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
 
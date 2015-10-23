package com.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortForLastElement {

    public static void insertIntoSorted(int[] ar) {
        int replaceIndex=0;
        int lastElement=ar[ar.length - 1 ];
    		for (int i = ar.length - 2 ; i >= 0; i--) {    				
    			 	if(ar[i] >= lastElement){
    			 		ar[i+1]=ar[i];
    			 		replaceIndex=i;
    			 		printArray(ar);
    			 	}   			 	    		    			 	    			     			 	    			 	
    		}    		
    		ar[replaceIndex]=lastElement;
    		printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
 
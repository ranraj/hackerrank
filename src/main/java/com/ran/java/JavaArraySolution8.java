package com.ran.java;
import java.util.*;

/**
 * Created by ranjithrajd on 20/11/15.
 */
public class JavaArraySolution8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] ar=new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = scan.nextInt();
        }
        for(int i=n ;i > 0;i--){
            System.out.println(i+" ");
        }
    }
}

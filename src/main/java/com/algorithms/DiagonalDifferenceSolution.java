package com.algorithms;

import java.util.Scanner;

/**
 * Created by ranjithrajd on 7/10/15.
 */
public class DiagonalDifferenceSolution {
    public static void main(String[] args) {
        java.util.Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[][] table=new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                table[i][j]=scanner.nextInt();
            }
        }

        int j=N-1;
        int diagonal1=0;
        int diagonal2=0;

        for (int i = 0; i < N; i++) {
                diagonal1+=table[i][i];
                diagonal2+=table[i][j--];
        }
        //System.out.println(diagonal1 +".."+ diagonal2);
        System.out.println(Math.abs( diagonal2 - diagonal1 ));
    }
}

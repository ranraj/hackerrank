package com.algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ranjithrajd on 7/10/15.
 */
public class Java8ArraySum {
    public static void main(String[] args) {
        java.util.Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] array=new int[N];

        for (int i = 0; i < N; i++) {
            array[i]=scanner.nextInt();
        }
        System.out.println(Arrays.stream(array).sum());
    }
}

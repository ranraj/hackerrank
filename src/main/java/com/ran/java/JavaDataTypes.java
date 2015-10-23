package com.ran.java;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by ranjithrajd on 27/7/15.
 */
public class JavaDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while(i<n){
        String s=scanner.next();;
        try {
            long t=Long.parseLong(s);
            System.out.println(t + " can be fitted in:");
            //byte
            if (t >= -Math.pow(2, 7) && t <= Math.pow(2, 7)-1)
                System.out.println("* byte");
            //short
            if (t >= -Math.pow(2, 15) && t <= Math.pow(2, 15)-1)
                System.out.println("* short");
            //int
            if (t >= -(Math.pow(2, 31)) && t <= (Math.pow(2, 31) - 1))
                System.out.println("* int");
            //long
            if (t >= -Math.pow(2, 63) && t <= (Math.pow(2, 63) - 1))
                System.out.println("* long");
        } catch (NumberFormatException e) {
            System.out.println(s+" can't be fitted anywhere");
        }
        scanner.nextLine();
        i++;
        }
    }
}

package com.ran.java;

import java.util.Scanner;

/**
 * Created by ranjithrajd on 27/7/15.
 */
/*
42
3.1415
Welcome to Hackerrank Java tutorials!
 */
public class StdInTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in).useDelimiter("\n");
        String i=scanner.next();
        Double d=Double.parseDouble(scanner.next());
        String s=scanner.next();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);
    }
}

package com.ran.java;

import java.util.*;
/**
 * Created by ranjithrajd on 9/10/15.
 */
public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
              //int x=Integer.parseInt(scanner.next());
              //int y=Integer.parseInt(scanner.next());
              int x=scanner.nextInt();
              int y=scanner.nextInt();
              System.out.println(x/y);
        }
        catch (InputMismatchException ime){
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException ae){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}

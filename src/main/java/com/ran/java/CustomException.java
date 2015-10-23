package com.ran.java;
import java.util.*;
/**
 * Created by ranjithrajd on 9/10/15.
 */
public class CustomException {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try {
                System.out.println(M.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
class myCalculator{
    public int power(int n,int p) throws Exception {

            if(n < 0 || p < 0){
                throw new Exception("n and p should be non-negative");
            }

        return (int)Math.pow(n,p);
    }
}


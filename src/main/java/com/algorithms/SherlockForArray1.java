package com.algorithms;
import java.util.Scanner;

/**
 * Created by ranjithrajd on 30/12/15.
 */
public class SherlockForArray1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int[] A = new int[N];
                for (int j = 0; j < N; j++) {
                    A[j] = scanner.nextInt();
                }
            process(A);
        }
    }

    private static void process(int[] a) {
        if(a.length == 1){System.out.println("YES"); return;}
        for (int i = 0; i < a.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = i-1; j >= 0; j--) {
                sumLeft += a[j];
            }
            for (int j = i+1; j < a.length; j++) {
                sumRight += a[j];
            }
            if(sumLeft == sumRight){
                //System.out.println(sumLeft+".."+sumRight);
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}

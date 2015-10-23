package com.algorithms;

import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by ranjithrajd on 7/10/15.
 */
public class LibraryFineSolution {
    public static void main(String[] args) {
        java.util.Scanner scanner=new Scanner(System.in);
        int actualDay=scanner.nextInt();
        int actualMonth=scanner.nextInt();
        int actualYear=scanner.nextInt();

        int expectedDay=scanner.nextInt();
        int expectedMonth=scanner.nextInt();
        int expectedYear=scanner.nextInt();

        int fineCount=(actualYear - expectedYear);
        int findAmount=0;
        if( fineCount > 0) {
            findAmount=fineCount * 10000;
        }else if(fineCount == 0){
            fineCount=(actualMonth - expectedMonth);
            if( fineCount > 0){
                findAmount=fineCount * 500;
            }else if(fineCount == 0){
                fineCount=(actualDay - expectedDay);
                if( fineCount > 0){
                    findAmount=fineCount * 15;
                }
            }
        }
        System.out.println(findAmount);
    }
}

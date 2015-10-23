package com.ran.java;

/**
 * Created by ranjithrajd on 10/10/15.
 */
class Solution{

    public static void main(String []argh){
        Adder X=new Adder();
        System.out.println("My superclass is: "+X.getClass().getSuperclass().getName());
        System.out.print(X.add(10,32)+" "+X.add(10,3)+" "+X.add(10,10)+"\n");

    }
}
class Adder extends  Arithmetic{
    public int add(int a, int b){
        return a+b;
    }
}
abstract class Arithmetic{
    abstract int add(int a,int b);
}
/*
interface Arithmetic{
    int add(int a,int b);
}*/

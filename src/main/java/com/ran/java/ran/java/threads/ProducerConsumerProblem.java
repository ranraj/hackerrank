package com.ran.java.ran.java.threads;

import java.util.Vector;

/**
 * Created by ranjithrajd on 30/9/15.
 */
public class ProducerConsumerProblem {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<Integer>();
        int limit=5;
        //Span two threads and start it all
        Thread producerThread=new Thread(new Producer(vector,limit),"Producer");
        Thread consumerThread=new Thread(new Consumer(vector,limit),"Consumer");
        producerThread.start();
        consumerThread.start();
    }

}

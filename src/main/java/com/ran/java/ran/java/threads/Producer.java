package com.ran.java.ran.java.threads;

import java.util.Vector;

/**
 * Created by ranjithrajd on 30/9/15.
 */
public class Producer implements Runnable {

    private static int THREAD_TIME_N=10;
    private final int limit;
    private Vector<Integer> vector;

    public Producer(Vector<Integer> vector,int size){
        this.vector=vector;
        this.limit=size;
    }
    @Override
    public void run() {
        for (int i = 0; i < THREAD_TIME_N; i++) {
            try {
                produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void produce(int i) throws InterruptedException {
           while (vector.size() == limit){
               synchronized (vector) {
                   System.out.println("Producer container is full");
                   vector.wait();
               }
           }
        synchronized (vector){
            vector.add(i);
            System.out.println("Produced "+i);
            vector.notifyAll();
        }
    }

}

package com.ran.java.ran.java.threads;

import java.util.Vector;

/**
 * Created by ranjithrajd on 30/9/15.
 */
public class Consumer implements Runnable {

    private static int THREAD_TIME_N=10;
    private final int limit;
    private Vector<Integer> vector;

    public Consumer(Vector<Integer> vector,int size){
        this.vector=vector;
        this.limit=size;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consumed "+ consume());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public int consume() throws InterruptedException {
        if (vector.isEmpty()){
            synchronized (vector) {
                System.out.println("Producer container is empty");
                vector.wait();
            }

        }
        synchronized (vector){
            vector.notifyAll();
         return  vector.remove(0);
        }
    }

}

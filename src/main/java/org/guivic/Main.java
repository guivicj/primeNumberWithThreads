package org.guivic;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        Thread t1 = new Thread(new PrimeThread(1, 100000));
        Thread t2 = new Thread(new PrimeThread(100001, 200000));
        Thread t3 = new Thread(new PrimeThread(200001, 300000));
        Thread t4 = new Thread(new PrimeThread(300001, 400000));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime + "ms");

    }
}
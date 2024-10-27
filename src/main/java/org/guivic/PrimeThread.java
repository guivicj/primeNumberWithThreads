package org.guivic;

public class PrimeThread implements Runnable {

    private int start, end;

    public PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime number");
            }
        }

    }

    private boolean isPrime(int n) {
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }
}

package Uppgift4;

class MyRunnable implements Runnable {
    int start;
    int end;
    int counter;

    public MyRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getCounter() {
        return counter;
    }

    public void checkPrime() {

        for (int x = start; x < end; x++){
            boolean prime = true;

            int i = 2;
            while(i <= x/2) {
                if (x % i == 0){
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime){
                counter++;
            }
        }
    }

    @Override
    public synchronized void run() {
        checkPrime();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyRunnable myRunnable = new MyRunnable(2, 350000);
        MyRunnable myRunnable1 = new MyRunnable(350001, 500000);

        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable1);

        long startTime = System.nanoTime();
        thread1.start();
        thread2.start();
        thread2.join();
        thread1.join();
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println("Runtime: " + time);

        int totalPrimes = myRunnable.getCounter() + myRunnable1.getCounter();
        System.out.println("Total number of primes: " + totalPrimes);
    }
}

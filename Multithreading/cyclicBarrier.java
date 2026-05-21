/*
cyclicBarrier is a syncronization aid that allows multiple threads to wait for each other
to reach a common barrier point, the barrier is called cyclic cause it can be reused after releasing
the threads   */
package Multithreading;

import java.util.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class cyclicBarrier {
    public static void main(String[] args) throws InterruptedException {
        // int matrix[][]; both are allowed
        // int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Solver solver = new Solver(3);
        solver.solve_fxn();

    }
}

class Solver {
    int N = 0;
    int count = 0;
    CyclicBarrier barrier;
    boolean done = false;
    Runnable barrierAction = new Runnable() {
        public void run() {
            System.out.println("rows merged."); // duplicate for mergin rows
            count++;
            if (count == 5) {
                done = true;
            }
        }
    };

    public Solver(int N) {
        this.N = N;
        barrier = new CyclicBarrier(N, barrierAction); /*
                                                        * CyclicBarrier that will trip when the given number of parties
                                                        * (threads) are waiting upon it, and which will execute the
                                                        * given barrier action when the barrier is tripped, performed by
                                                        * the last thread entering the barrier.
                                                        */
    }

    public void solve_fxn() throws InterruptedException {
        List<Thread> threadPool = new ArrayList<Thread>(N);

        for (int i = 0; i < N; ++i) {
            Thread thread = new Thread(new Worker(i));
            threadPool.add(thread);
            thread.start();
        }

        for (Thread thread : threadPool) {
            thread.join();
        }
    }

    // following also demonstrates how can stuff outside runnable can be passed and
    // accessed inside via constructor
    class Worker implements Runnable {
        int currentRow;

        public Worker(int row) {
            this.currentRow = row;
        }

        @Override
        public void run() {
            while (!done) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                try {
                    barrier.await();
                } catch (BrokenBarrierException b) {
                    return;
                } catch (InterruptedException i) {
                    return;
                }

            }
        }
    }

}
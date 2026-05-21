package AsynchronousProgramming;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        tester testerObject = new tester(2000);
        tester testerObject2 = new tester(5000);
        // <> is the diamond operator, it is a part of generics in java, java
        // automatically inferes
        // the type form. <> is used when the return object is uncertain
        FutureTask task = new FutureTask<>(testerObject, "Task on Tester completed.");
        FutureTask task2 = new FutureTask<>(testerObject2, "Task2 completed");
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(task);
        service.submit(task2);
        

        while (true) {
            try {
                // completion of task maybe due to termination, cancellation, or normal shutdown
                if (task.isDone() && task2.isDone()) {
                    System.out.println("Both tasks executed successfully.");
                    service.shutdown();
                    return;
                }

                if (!task.isDone()) {
                    System.out.println("FutureTask1 output = "
                            + task.get());
                }

                System.out.println("Waiting for FutureTask2 to complete");

                String s = (String) task2.get(250, TimeUnit.MILLISECONDS);
                if (s != null) {
                    System.out.println("FutureTask2 output=" + s);
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e);
            }
        }
    }

    static class tester implements Runnable {
        private int time;

        public tester(int timeInput) {
            this.time = timeInput;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(time);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                System.out.println("Exceptin ouccuered.");
            }

        }
    }
}
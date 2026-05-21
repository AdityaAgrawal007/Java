package AsynchronousProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// using executors you can make a thread pool with number of threads of your choice, you only give it
// tasks to perform it does the queying and all and runs it on those threads 
// executor threads may run different runnables one after other, but normal threads are terminated
// as soon as the task is completed a normal thread is terminated hence it cannot run another runnable 
public class Executorr {
    public static void main(String args[]){
        // ExecutorService is just an interface, Executors is a Factory that returns an object
        // of the class that implements the interface 

        ExecutorService executor = Executors.newFixedThreadPool(1);
        test testObject = new test();
        executor.submit(testObject);
        executor.shutdown();
    }
}

class test implements Runnable{
    @Override
    public void run(){
        System.out.println("Runnable Executed.");
    }
}

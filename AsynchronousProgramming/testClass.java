// why use Runnable ? why not just pass the function itself anyway ? 
// causee in java unlike other langs where you can directly pass the function like (Thread(fxn))
// in java Thread it needs an object a wrapper 
package AsynchronousProgramming;

import Multithreading.thread;

// by implementing this interface we make the object of this class runnable so that it can be 
// passed to a method 
class task implements Runnable{
    @Override
    // runnable cannot normally return anything 
    public void run(){
        System.out.println("executing task.");
    }
}

public class testClass{
    public static void main(String[] args){
        task object = new task();
        Thread t = new Thread(object);
        t.start();

        // the mordern implementation is using lambdas 
        Runnable task2 = () -> {
            System.out.println("task2 executed.");
        };

        Thread t1 = new Thread(task2);
        t1.start();
        Thread t2 = new Thread(task2);
        t2.start();
    }
}
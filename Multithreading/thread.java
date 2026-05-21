package Multithreading;

public class thread {
    void callable(){
        System.out.println("Thread " + Thread.currentThread().threadId() + "running ...");
    }

    public static void main(String args[]){
        thread obj = new thread();

        Thread t = new Thread(obj::callable);
        t.start(); // starts the thread
    }
}

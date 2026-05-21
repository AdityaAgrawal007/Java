/*
if two threads are working on the same variable then that variable will be in that threads
local cache, and hence the threads won't be able to exchange the editz done to the data
unless you use volatile keyword with then flushes the changes made from local chache to the 
shared chache and that change is refreshed in the other threads local cach, this solves the 
"visibility" problem */
package Universal;

// used to ensure that changes made to a variable are immediately visible to all threads
// does not provide atomicity ? 

class SharedData {
    volatile boolean flag = false;
}

class test extends Thread {
    SharedData data = new SharedData();

    public test(SharedData data) {
        this.data = data;
    }

    /*
     * when thread.start() JVM creates a new thread and executes run on it
     * because the run signature doesn't have a parameter - boolean SharedData hence
     * we
     * cannot pass boolean SharedData as an argument directly
     */
    @Override
    public void run() {

        while (!data.flag) {
        }

        System.out.println("SharedData changed.");
    }
}

class Volatile {
    public static void main(String args[]) throws InterruptedException {
        SharedData data = new SharedData();
        test obj = new test(data);
        obj.start(); // spawn a new thread 
        Thread.sleep(1000);
        data.flag = true;
    }

}
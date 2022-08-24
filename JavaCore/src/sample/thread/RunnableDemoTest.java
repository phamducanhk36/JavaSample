package sample.thread;

class RunnableDemo implements Runnable {

    private String threadName;
    private Thread t;

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("creating " + name);
    }

    @Override
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

}
public class RunnableDemoTest {

    public static void main(String args[]) throws InterruptedException {
        RunnableDemo R1 = new RunnableDemo( "Thread-1");
        Thread t1 = new Thread(R1);
        t1.start();
        t1.join();


        RunnableDemo R2 = new RunnableDemo( "Thread-2");
        Thread t2 = new Thread(R2);
        t2.start();
        t2.join();
    }
}

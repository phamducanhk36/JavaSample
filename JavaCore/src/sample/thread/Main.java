package sample.thread;

import java.lang.management.ManagementFactory;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // wait notify in thead
        EvenOddPrinter p = new EvenOddPrinter();
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name);
        Thread t1 = new Thread(p::printEven);

        Thread t2 = new Thread(p::printOdd);
        t1.start();
        t2.start();

    }


}

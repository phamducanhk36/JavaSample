package sample.thread;

public class EvenOddPrinter {

    int i = 1;

    public void printOdd() {
        synchronized (this) {
            while (i < 20) {
                while (i % 2 == 0) {
                    try {
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(i + " ");
                i++;
                notify();
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (i < 20) {
                while (i % 2 == 1) {
                    try {
                        Thread.sleep(2000);
                        wait();
                    } catch (
                            InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print(i + " ");
                i++;
                notify();
            }
        }
    }
}

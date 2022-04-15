/**
 * @Author tanyacheng
 * @Date 2022/4/11 16:42
 * @Version 1.0
 */
package top.ligongd.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Printer{
    private int n;

    public Printer(int n) {
        this.n = n;
    }

    CyclicBarrier cb = new CyclicBarrier(2);
    volatile boolean fin = true;

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while(!fin);
            printFoo.run();
            fin = false;
            try {
                cb.await();
            } catch (BrokenBarrierException e) {}
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            try {
                cb.await();
            } catch (BrokenBarrierException e) {}
            printBar.run();
            fin = true;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        PrinterFoo pf = new PrinterFoo();
        PrinterBar pb = new PrinterBar();
        Printer pr = new Printer(7);
        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                try {
                    pr.foo(pf);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            new Thread(() -> {
                try {
                    pr.bar(pb);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

}

class PrinterFoo implements Runnable {
    @Override
    public void run() {
        System.out.println("foo");
    }
}

class PrinterBar implements Runnable {
    @Override
    public void run() {
        System.out.println("bar");
    }
}
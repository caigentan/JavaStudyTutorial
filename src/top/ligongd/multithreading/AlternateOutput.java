/**
 * @Author tanyacheng
 * @Date 2022/4/11 19:16
 * @Version 1.0
 */
package top.ligongd.multithreading;

public class AlternateOutput {
    public static boolean flag = true;
    public static int counter = 0;

    public static void main(String[] args) {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                while(true){
                    while (counter != 0){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("AAA");
                    counter=2;
                    lock.notify();
                }
            }
        }).start();
        new Thread(() -> {
            synchronized (lock) {
                while(true){
                    while (counter != 2){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("BBB");
                    counter=0;
                    lock.notify();
                }
            }
        }).start();
    }
}

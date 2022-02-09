/**
 * @Author tanyacheng
 * @Date 2022/2/9 21:29
 * @Version 1.0
 */
package top.ligongd.multithreading;

public class MainThread{

    public static void main(String[] args) {
        Thread helloThread = new HelloThread();
        helloThread.start();

        Thread runnableThread = new Thread(new RunnableThread());
        runnableThread.start();
        for(int j = 0; j < 4; j++) {
            System.out.println("Main Thread " + j);
        }
    }

}

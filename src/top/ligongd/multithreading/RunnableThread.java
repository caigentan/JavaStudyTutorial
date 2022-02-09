/**
 * @Author tanyacheng
 * @Date 2022/2/9 21:40
 * @Version 1.0
 */
package top.ligongd.multithreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        int j = 0;
        while(j < 5)
            System.out.println("RunnableThread " + j++);
    }
}

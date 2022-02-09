/**
 * @Author tanyacheng
 * @Date 2022/2/9 21:30
 * @Version 1.0
 */
package top.ligongd.multithreading;

public class HelloThread extends Thread{
    @Override
    public void run() {
        int index = 1;

        for(int i=0;i< 5;i++)
            System.out.println("Hello " + index++);
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/3/11 22:41
 * @Version 1.0
 */
package top.ligongd.multithreading.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable workServer = new WorkThread(" " + i);
            executor.execute(workServer);
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        }
        System.out.println("Finished all Threads");
    }
}

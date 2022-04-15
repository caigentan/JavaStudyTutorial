/**
 * @Author tanyacheng
 * @Date 2022/3/24 20:39
 * @Version 1.0
 */
package top.ligongd.multithreading.executor;

import java.util.concurrent.*;

public class StartCallable1 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        StartCallable1 task = new StartCallable1();
        Future<Integer> future = service.submit(task);
        System.out.println(future.get());
    }
}

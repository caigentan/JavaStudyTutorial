/**
 * @Author tanyacheng
 * @Date 2022/3/24 20:56
 * @Version 1.0
 */
package top.ligongd.multithreading.threadgroups;

public class ThreadGroupDemo1 {
    public static void main(String[] args) {
        Thread testThread1 = new Thread(() ->{
            System.out.println("testThread1当前线程组名字" + Thread.currentThread().getThreadGroup().getName());
            System.out.println("testThread1当前线程名字" + Thread.currentThread().getName());
        });
        testThread1.start();
        System.out.println("执行main方法线程名：" + Thread.currentThread().getName());



    }
}

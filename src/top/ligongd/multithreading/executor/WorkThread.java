/**
 * @Author tanyacheng
 * @Date 2022/3/11 22:29
 * @Version 1.0
 */
package top.ligongd.multithreading.executor;

public class WorkThread implements Runnable{
    private String common;
    public WorkThread(String s){
        this.common = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "start, common = " + this.common);
        processThread();
        System.out.println(Thread.currentThread().getName() + "end, common = " + this.common);
    }

    private void processThread(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "WorkThread{" +
                "common='" + common + '\'' +
                '}';
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/2/1 23:13
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.observerpattern;

public class ConcreteObserver1 implements Observer{
    @Override
    public void update() {
        System.out.println("观察者1收到信息处理");
    }
}

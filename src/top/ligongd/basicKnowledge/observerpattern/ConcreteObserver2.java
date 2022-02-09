/**
 * @Author tanyacheng
 * @Date 2022/2/1 23:14
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.observerpattern;

public class ConcreteObserver2 implements Observer{
    @Override
    public void update() {
        System.out.println("观察者2收到信息并处理");
    }
}

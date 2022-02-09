/**
 * @Author tanyacheng
 * @Date 2022/2/1 23:11
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.observerpattern;

public class ConcreteSubject extends Subject{
    /**
     * 具体的观察者
     */
    public void doSomething(){
        System.out.println("被观察者事件发生改变");
        this.notifyObserver();
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/2/1 23:15
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.observerpattern;

public class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver1());
        subject.addObserver(new ConcreteObserver2());
        subject.doSomething();
    }
}

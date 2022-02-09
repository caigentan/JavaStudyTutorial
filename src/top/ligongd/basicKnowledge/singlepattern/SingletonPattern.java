/**
 * @Author tanyacheng
 * @Date 2022/1/28 22:00
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.singlepattern;

public class SingletonPattern {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        singletonObject1.showMessage();
    }
}

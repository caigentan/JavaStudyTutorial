/**
 * @Author tanyacheng
 * @Date 2022/1/28 21:56
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.singlepattern;

public class SingletonObject {
    private static SingletonObject instance;

    private SingletonObject(){};

    public static SingletonObject getInstance(){
        if (instance == null) {
            instance = new SingletonObject();
            System.out.println("create new instance");
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("hello world");
    }
}

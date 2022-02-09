/**
 * @Author tanyacheng
 * @Date 2022/1/25 21:44
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.factorypattern;

public class MainUse {
    public static void main(String[] args) {
        Animal animal = new Cat();

        animal.sayHello();

    }
}

/**
 * @Author tanyacheng
 * @Date 2022/1/25 21:42
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.factorypattern;

public class Cat implements Animal{

    @Override
    public void sayHello() {
        System.out.println("miao");
    }

    public void salBay() {
        System.out.println("bay bay");
    }
}

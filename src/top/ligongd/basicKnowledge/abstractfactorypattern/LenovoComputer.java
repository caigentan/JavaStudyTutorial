/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:01
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class LenovoComputer implements Computer{
    /**
     * 具体产品 联想电脑
     */
    @Override
    public void show() {
        System.out.println("Lenove Computer");
    }
}

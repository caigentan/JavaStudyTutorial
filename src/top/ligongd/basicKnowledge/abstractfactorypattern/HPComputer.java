/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:02
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class HPComputer implements Computer{
    /**
     * 具体产品 惠普电脑
     */
    @Override
    public void show() {
        System.out.println("Huipu Computer");
    }
}

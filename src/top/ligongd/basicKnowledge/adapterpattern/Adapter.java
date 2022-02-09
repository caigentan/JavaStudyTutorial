/**
 * @Author tanyacheng
 * @Date 2022/1/31 23:42
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.adapterpattern;

public class Adapter extends AmericanCharge implements Target220V{
    /**
     * 类适配器，通过继承现有接口来完成对现有接口的扩展
     */
    @Override
    public void chargeBy220V() {
        super.chargeBy110V();
        System.out.println("110V 调成为 220V");
    }
}

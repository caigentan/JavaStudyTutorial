/**
 * @Author tanyacheng
 * @Date 2022/1/31 23:41
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.adapterpattern;

public class AmericanCharge implements Adaptee{
    /**
     * 现有美国电器，实现110V充电
     */
    @Override
    public void chargeBy110V() {
        System.out.println("American Charge By 110V");
    }
}

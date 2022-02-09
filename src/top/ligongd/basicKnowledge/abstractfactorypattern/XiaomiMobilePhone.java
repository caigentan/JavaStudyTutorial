/**
 * @Author tanyacheng
 * @Date 2022/1/26 23:59
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class XiaomiMobilePhone implements MobilePhone{
    /**
     * 具体产品 小米手机
     */
    @Override
    public void show() {
        System.out.println("Xiaomi Mobile Phone");
    }
}

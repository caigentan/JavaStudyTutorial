/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:01
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class HuaweiMobilePhone implements MobilePhone{
    /**
     * 具体产品 华为手机
     */
    @Override
    public void show() {
        System.out.println("Huawei Mobile phone");
    }
}

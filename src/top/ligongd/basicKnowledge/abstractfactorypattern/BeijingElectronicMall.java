/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:04
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class BeijingElectronicMall implements ElectronicMall{
    /**
     * 具体工厂 北京电器城，卖手机，卖电脑
     */
    @Override
    public MobilePhone getMobilePhone() {
        System.out.println("Beijing sell Xiaomi mobile phone");
        return new XiaomiMobilePhone();
    }

    @Override
    public Computer getComputer() {
        System.out.println("Beijing sell Huipu Computer");
        return new HPComputer();
    }
}

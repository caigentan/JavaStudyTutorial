/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:07
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class ShanghaiElectronicMall implements ElectronicMall{
    /**
     * 具体工厂 上海电器城，卖华为手机和联想电脑
     */
    @Override
    public MobilePhone getMobilePhone() {
        System.out.println("Shanghai sell Huawei mobile phone");
        return new HuaweiMobilePhone();
    }

    @Override
    public Computer getComputer() {
        System.out.println("Shanghai sell Lenovo Computer");
        return new LenovoComputer();
    }
}

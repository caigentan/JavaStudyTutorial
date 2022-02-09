/**
 * @Author tanyacheng
 * @Date 2022/1/27 0:09
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.abstractfactorypattern;

public class Consumer {

    /**
     * 消费者，用户，到具体电器城购买手机和电脑
     */

    public static void main(String[] args) {
        ElectronicMall beijin = new BeijingElectronicMall();
        MobilePhone buyNewMobilePhone = beijin.getMobilePhone();
        buyNewMobilePhone.show();
        Computer buyNewComputer = beijin.getComputer();
        buyNewComputer.show();

        ElectronicMall shanghai = new ShanghaiElectronicMall();
        MobilePhone buySecondMobilePhone = shanghai.getMobilePhone();
        buySecondMobilePhone.show();
        Computer buySecondComputer = shanghai.getComputer();
        buySecondComputer.show();
    }
}

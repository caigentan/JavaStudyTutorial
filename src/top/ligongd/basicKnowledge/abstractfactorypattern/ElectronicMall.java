package top.ligongd.basicKnowledge.abstractfactorypattern;

public interface ElectronicMall {
    /**
     * 抽象工厂，电器城里可以卖电脑，也可以卖手机
     * 手机和电脑是抽象产品，因为手机和电脑都有多种不同品牌
     */
    public MobilePhone getMobilePhone();
    public Computer getComputer();
}

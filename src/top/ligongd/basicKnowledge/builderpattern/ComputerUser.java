/**
 * @Author tanyacheng
 * @Date 2022/1/29 23:02
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public class ComputerUser {

    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder macBuilder = new MacComputer("I7", "920", "16");
        ComputerBuilder huaweiBuilder = new HuaWeiComputer("I7","MX450", "16");
        director.makeComputer(macBuilder);
        director.makeComputer(huaweiBuilder);

        Computer macComputer = macBuilder.getComputer();
        Computer huaweiComputer = huaweiBuilder.getComputer();

        System.out.println("Mac " + macComputer.toString());
        System.out.println("Huawei " + huaweiComputer.toString());

    }
}

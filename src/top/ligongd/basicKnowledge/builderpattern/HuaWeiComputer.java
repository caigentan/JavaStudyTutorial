/**
 * @Author tanyacheng
 * @Date 2022/1/29 22:51
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public class HuaWeiComputer extends ComputerBuilder{
    private Computer computer;

    public HuaWeiComputer(String cpu, String gpu, String ram) {
        this.computer = new Computer(cpu, gpu, ram);
    }

    @Override
    public ComputerBuilder setUsbCount() {
        this.computer.setUsbCount(3);
        return this;
    }

    @Override
    public ComputerBuilder setDisplay() {
        this.computer.setDisplay("HuaWei Display");
        return this;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}

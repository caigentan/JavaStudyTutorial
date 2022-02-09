/**
 * @Author tanyacheng
 * @Date 2022/1/29 22:47
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public class MacComputer extends ComputerBuilder{
    private Computer computer;
    public MacComputer(String cpu, String gpu, String ram){
        this.computer = new Computer(cpu, gpu, ram);
    }
    @Override
    public ComputerBuilder setUsbCount() {
        this.computer.setUsbCount(2);
        return this;
    }

    @Override
    public ComputerBuilder setDisplay() {
        this.computer.setDisplay("Mac Display");
        return this;
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}

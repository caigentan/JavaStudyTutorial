/**
 * @Author tanyacheng
 * @Date 2022/1/29 22:45
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public abstract class ComputerBuilder {
    public abstract ComputerBuilder setUsbCount();
    public abstract ComputerBuilder setDisplay();

    public abstract Computer getComputer();
}

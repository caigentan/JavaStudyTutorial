/**
 * @Author tanyacheng
 * @Date 2022/1/29 22:55
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public class ComputerDirector {
    public void makeComputer(ComputerBuilder builder) {
        builder.setUsbCount().setDisplay();
    }
}

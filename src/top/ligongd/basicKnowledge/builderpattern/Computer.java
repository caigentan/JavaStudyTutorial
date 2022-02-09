/**
 * @Author tanyacheng
 * @Date 2022/1/29 22:38
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.builderpattern;

public class Computer {
    /**
     * Computer 类，用于完成各式电脑的初始化
     */
    private String cpu; //必备
    private String gpu; //必备
    private String ram; // 必备
    private int usbCount; // 可选
    private String display; //可选

    public Computer(String cpu, String gpu, String ram) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public void setUsbCount(int count) {
        this.usbCount = count;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", usbCount=" + usbCount +
                ", display='" + display + '\'' +
                '}';
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/2/27 10:54
 * @Version 1.0
 */
package top.ligongd.demos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Demo {
    public static int aTemp = 0;
    public static void main(String[] args) {
        Demo demo1 = new Demo();
        Demo demo2 = new Demo();
        demo1.aTemp = 3;
        System.out.println(demo2.aTemp);
    }
}

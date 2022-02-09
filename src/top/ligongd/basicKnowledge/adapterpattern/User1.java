/**
 * @Author tanyacheng
 * @Date 2022/1/31 23:51
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.adapterpattern;

public class User1 {
    public static void main(String[] args) {
        // 现有一个110V美国充电口,但是无法直接使用
        Adaptee adaptee = new AmericanCharge();

        //将此口提供给适配器，适配器转换为220V
        ObjectAdapter adapter = new ObjectAdapter(adaptee);
        adapter.chargeBy220V();
    }
}

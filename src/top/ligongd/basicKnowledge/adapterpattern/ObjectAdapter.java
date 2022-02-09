/**
 * @Author tanyacheng
 * @Date 2022/1/31 23:49
 * @Version 1.0
 */
package top.ligongd.basicKnowledge.adapterpattern;

public class ObjectAdapter implements Target220V{
    Adaptee adaptee; //持有现有具体实现对象的引用

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void chargeBy220V() {
        this.adaptee.chargeBy110V();
        System.out.println("110V 调成 220V---2");
    }
}

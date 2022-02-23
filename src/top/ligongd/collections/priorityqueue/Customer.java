/**
 * @Author tanyacheng
 * @Date 2022/2/23 20:04
 * @Version 1.0
 */
package top.ligongd.collections.priorityqueue;

public class Customer implements Comparable<Customer>{
    private String name;
    private int price;

    public Customer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " price "+this.price;
    }

    @Override
    public int compareTo(Customer o) {
        return -(this.price - o.price);
    }
}

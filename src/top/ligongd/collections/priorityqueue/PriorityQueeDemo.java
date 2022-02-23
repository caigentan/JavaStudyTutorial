/**
 * @Author tanyacheng
 * @Date 2022/2/23 20:10
 * @Version 1.0
 */
package top.ligongd.collections.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueeDemo {
    public static void main(String[] args) {
        PriorityQueue<Customer> customerPriorityQueue = new PriorityQueue<>();

        Customer customer1 = new Customer("Bill",32);
        Customer customer2 = new Customer("Caigen", 33);
        Customer customer3 = new Customer("wangang", 12);

        customerPriorityQueue.add(customer1);
        customerPriorityQueue.add(customer2);
        customerPriorityQueue.add(customer3);

        for (Customer customer: customerPriorityQueue){
            System.out.println(customer.toString());
        }
    }
}

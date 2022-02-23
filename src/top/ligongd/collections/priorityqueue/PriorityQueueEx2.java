/**
 * @Author tanyacheng
 * @Date 2022/2/23 20:24
 * @Version 1.0
 */
package top.ligongd.collections.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {
    public static void main(String[] args) {
        Employee tom = new Employee("Tom", 2000);
        Employee jerry = new Employee("Jerry", 500);
        Employee donald = new Employee("Donald", 3000);
        Employee mickey = new Employee("Mickey", 2000);
        Employee daffy = new Employee("Daffy", 5000);

        PriorityQueue<Employee> queue = new PriorityQueue<>(new EmployeeComparator());

        queue.add(tom);
        queue.add(jerry);
        queue.add(donald);
        queue.add(mickey);
        queue.add(daffy);

        Employee currentEmployee = null;

        while ((currentEmployee = queue.poll()) != null) { // Retrieves and removes

            System.out.println(currentEmployee.toString());
        }
    }
}

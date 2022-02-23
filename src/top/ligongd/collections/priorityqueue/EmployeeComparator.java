/**
 * @Author tanyacheng
 * @Date 2022/2/23 20:22
 * @Version 1.0
 */
package top.ligongd.collections.priorityqueue;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1 == o2)
            return 0;
        if (o1 == null)
            return -1;
        if (o2 == null)
            return 1;
        return o1.getAge() - o2.getAge();
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/4/17 21:02
 * @Version 1.0
 */
package top.ligongd.java8.lambdas.supplier;

import java.util.function.Supplier;

public class SupplierCase1 {
    public static void main(String[] args) {
        Supplier<Student> stu = Student::new;
        Student s = stu.get();
        s.setAge(5);
        System.out.println(s.getAge());

        Supplier<String> str = ()->"12345";
        System.out.println(str.get());
    }
}

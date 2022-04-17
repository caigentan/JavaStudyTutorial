/**
 * @Author tanyacheng
 * @Date 2022/4/17 20:28
 * @Version 1.0
 */
package top.ligongd.java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambda1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,6,7,8,9);
        list.forEach(System.out::println);//方法引用
        list.forEach((Integer x)-> System.out.println("* " + x + " *"));
        list.stream().filter(o->o%2==0).forEach(System.out::print);
        list.stream().filter(o->o%2==0).collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> list2 = list.stream().filter(o->o%2==1).collect(Collectors.toList());
        list2.forEach(System.out::println);
        Supplier<Lambda1> s = Lambda1::new;
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/4/17 21:11
 * @Version 1.0
 */
package top.ligongd.java8.lambdas.sort;

import top.ligongd.java8.lambdas.supplier.Student;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompareToSort {
    public static void main(String[] args) {
        Set<Integer> sl = new TreeSet<>(Integer::compareTo);
        sl.add(3);
        sl.add(4);
        sl.add(2);
        for (int x:
             sl) {
            System.out.println(x);
        }
        List<Integer> integerList = Arrays.asList(2,3,1,1,8,7,4,9);
        integerList = integerList.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        for (int x:integerList) {
            System.out.print(x+" ");
        }

        Stream<Double> doubleStream = Stream.generate(Math::random);
        doubleStream.forEach(System.out::println);
    }
}

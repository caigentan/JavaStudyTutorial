/**
 * @Author tanyacheng
 * @Date 2022/3/7 10:19
 * @Version 1.0
 */
package top.ligongd.streamoperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionBaseOperator {
    public static void main(String[] args) {
        List<Integer> resList = Arrays.asList(2,3,5,7,1,4,9);
        resList.stream().filter(
                s -> s % 2 == 0
        ).sorted().forEach(System.out::println);
    }
}

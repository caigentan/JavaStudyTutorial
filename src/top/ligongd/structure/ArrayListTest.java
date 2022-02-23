/**
 * @Author tanyacheng
 * @Date 2022/2/11 12:36
 * @Version 1.0
 */
package top.ligongd.structure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res.add(12);
        res.add(22);

        System.out.println(res.getClass());
        System.out.println(new ArrayList(res).getClass());
        System.out.println("123"+'4');

        char[][] chess = new char[][]{{'1','2'},{'2','3'}};
        System.out.println(chess);
        System.out.println(11^1);
    }
}

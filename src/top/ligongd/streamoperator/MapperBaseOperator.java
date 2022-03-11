/**
 * @Author tanyacheng
 * @Date 2022/3/7 10:25
 * @Version 1.0
 */
package top.ligongd.streamoperator;

import java.util.HashMap;
import java.util.Map;

public class MapperBaseOperator {
    public static void main(String[] args) {
        Map<Integer, Integer> resMap = new HashMap<>();
        resMap.put(3, 5);
        resMap.put(6, 9);
        resMap.put(7, 3);

//        System.out.println('9'-'0');
        int[] mapping = {2,2,2,4,5,6,7,8,9};
        int[] nums = {221,221,331};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num, Integer.parseInt(
                    String.join("",(""+num).chars().mapToObj(
                            q->"" + mapping[q-'0']).toArray(String[]::new))
            ));
        }

        System.out.println(-7%3);
    }
}

/**
 * @Author tanyacheng
 * @Date 2022/2/27 10:54
 * @Version 1.0
 */
package top.ligongd.demos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Demo {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,42,3,1,5,6};
        quick(a,0, a.length-1);
        for (int x: a){
            System.out.println(x);
        }
    }

    public static void quick(int a[], int s, int e){
        if(s<e){
            int temp = quickSort(a, s, e);
            quick(a, s, temp-1);
            quick(a, temp+1, e);
        }
    }

    public static int quickSort(int[] nums, int start, int end){
        int sc = nums[start];
//        System.out.println(sc);
        while(start < end){
            while((start < end) && (sc <= nums[end])){
                end--;
            }
            nums[start] = nums[end];
            while((start < end ) && (sc >= nums[start])){
                start++;
            }
            nums[end] = nums[start];
        }
        nums[start] = sc;
        return start;
    }
}

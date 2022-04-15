/**
 * @Author tanyacheng
 * @Date 2022/2/27 10:54
 * @Version 1.0
 */
package top.ligongd.demos;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

class Demo {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("AAa"));
    }
    public static int longestPalindrome(String s) {
        if(s.length() == 1){
            return 1;
        }
        char[] sl = s.toCharArray();
        Arrays.sort(sl);
        int k=0;
        int m=1;
        for(int i=0;i<sl.length-1;i++){
            if(sl[i+1] == sl[i]){
                m++;
            }
            if(sl[i+1] != sl[i] || i+1 == sl.length-1){
                if(m % 2 == 1){
                    m--;
                }
                k += m;
                m=1;
            }
        }

        if(k == sl.length)
            return k;
        else
            return k+1;
    }
}

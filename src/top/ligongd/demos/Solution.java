/**
 * @Author tanyacheng
 * @Date 2022/2/19 23:48
 * @Version 1.0
 */
package top.ligongd.demos;

import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int out = solution.myAtoi("21474836460");
//        System.out.println(1 | 10);
        System.out.println(Integer.toBinaryString(34));
//        System.out.println(out);
//        System.out.println(Integer.MAX_VALUE);
    }
    public int myAtoi(String s) {
        boolean isStart = true;
        boolean iszerostart = true;
        String ng = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '+' || c == '-'){
                if(isStart){
                    ng += ""+c;
                    isStart = false;
                    continue;
                }else{
                    break;
                }
            }else if(c == ' '){
                if(isStart)
                    continue;
                else
                    break;
            }else if(c - '0' < 10 && c - '0' >=0){
                if(c == '0' && isStart){
                    isStart = false;
                    ng = ng + c;
                    continue;
                }
                ng = ng + c;
            } else {
                break;
            }
        }
        if(ng == "" || "+".equals(ng) || "-".equals(ng))
            return 0;
        long out = Long.valueOf(ng);
        if(out > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(out < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)out;
    }
}
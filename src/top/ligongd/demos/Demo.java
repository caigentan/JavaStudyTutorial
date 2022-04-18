/**
 * @Author tanyacheng
 * @Date 2022/2/27 10:54
 * @Version 1.0
 */
package top.ligongd.demos;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

sealed class Demo permits Demo1{

    public static void main(String[] args) {
        int n = 9;
        switch (n / 3){
            case 3,4,5-> System.out.println(n/3);
        }
    }

}

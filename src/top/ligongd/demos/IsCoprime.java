/**
 * @Author tanyacheng
 * @Date 2022/2/10 11:04
 * @Version 1.0
 */
package top.ligongd.demos;

public class IsCoprime {

    public static void main(String[] args) {
        System.out.println(isCoprime(4,9));
    }
    public static boolean isCoprime(int a, int b){
        if(a == 1)
            return true;
        if(b % a == 0)
            return false;
        return isCoprime(b%a, a);
    }
}

package javasolutions;

/**
 * @ClassName BitCounting
 * @Description: ref: https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class BitCounting {
    public static int countBits(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }
}

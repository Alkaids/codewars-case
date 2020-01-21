package java;

/**
 * @ClassName Square
 * @Description: ref: https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class Square {
    public static boolean isSquare(int n) {
        if (n < 0) return false;
        if (n <= 1) return true;
        int l = 0;
        int r = n;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int sq = n / mid;
            if (sq < mid) {
                r = mid - 1;
            } else if (sq > mid) {
                l = mid + 1;
            } else {
                if (n % mid == 0) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

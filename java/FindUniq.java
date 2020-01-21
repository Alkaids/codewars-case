package java;

/**
 * @ClassName FindUniq
 * @Description: ref: https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class FindUniq {
    public static double findUniq(double[] arr) {
        double l = arr[0];
        double r = arr[arr.length - 1];
        if (l != r) {
            if (arr[arr.length - 2] == r) {
                return l;
            } else {
                return r;
            }
        } else {
            for (int i = 1; i <= arr.length - 2; i++) {
                if (arr[i] != l) {
                    return arr[i];
                }
            }
        }
        return arr[0];
    }
}

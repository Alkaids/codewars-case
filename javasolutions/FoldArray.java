package javasolutions;

import java.util.Arrays;

/**
 * @ClassName FoldArray
 * @Description: ref: https://www.codewars.com/kata/57ea70aa5500adfe8a000110/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class FoldArray {
    public static int[] foldArray(int[] array, int runs) {
        if (array == null || array.length < 2) return array;
        if (runs == 0) return array;
        int l = 0;
        int r = array.length - 1;
        int len = array.length;
        int[] copyArr = Arrays.copyOf(array,len);
        while (runs > 0) {
            while (l < r) {
                copyArr[l] = copyArr[l] + copyArr[r];
                l++;
                r--;
            }
            double c = ((double) len) / 2;
            len = (int) Math.ceil(c);
            runs--;
            l = 0;
            r = len - 1;
        }
        return Arrays.copyOf(copyArr, len);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5}, 3)));
    }
}

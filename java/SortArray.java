package java;

/**
 * @ClassName SortArray
 * @Description: ref: https://www.codewars.com/kata/578aa45ee9fd15ff4600090d/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class SortArray {
    public static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i] > array[j] && array[i] % 2 != 0 && array[j] % 2 != 0) {
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }
}

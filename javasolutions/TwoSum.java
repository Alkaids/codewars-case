package javasolutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TwoSum
 * @Description: ref: https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>(numbers.length, 1);
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            map.putIfAbsent(numbers[i], i);
            int tar = target - numbers[i];
            if (map.get(tar) != null) {
                res[1] = i;
                res[0] = map.get(tar);
                return res;
            }
        }
        return res;
    }
}

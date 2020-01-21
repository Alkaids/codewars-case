package java;

/**
 * @ClassName Multiples3or5
 * @Description: ref: https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class Multiples3or5 {
    public int solution(int number) {
        int i = 0;
        int res = 0;
        int j = 0;
        while (i < number - 3) {
            i = i + 3;
            if (i % 3 == 0 && i % 5 == 0) {
                res += i;
                continue;
            }
            if (i % 3 == 0) {
                res += i;
            }
        }
        while (j < number - 5) {
            j = j + 5;
            if (j % 3 == 0 && j % 5 == 0) {
                continue;
            }
            if (j % 5 == 0) {
                res += j;
            }
        }
        return res;
    }
}

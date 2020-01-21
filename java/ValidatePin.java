package java;

/**
 * @ClassName ValidatePin
 * @Description: ref: https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class ValidatePin {
    public static boolean validatePin(String pin) {
        if (null == pin) return false;
        int len = pin.getBytes().length;
        char[] chars = pin.toCharArray();
        if (len != 4 && len != 6) {
            return false;
        }
        for (char c : chars) {
            if ((int) c < 48 || (int) c > 57) {
                return false;
            }
        }
        return true;
    }
}

package javasolutions;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName CountingDuplicates
 * @Description: ref: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 * @Author gravel
 * @Date 2020/1/21
 * @Version V1.0
 **/
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] strs = text.toLowerCase().split("");
        Map<String,Integer> map = new HashMap<>(strs.length,1);
        int res = 0;
        for(String s: strs){
            map.put(s,map.getOrDefault(s,0)+1);
            if(map.get(s)==2){
                ++res;
            }
        }
        return res;
    }
}

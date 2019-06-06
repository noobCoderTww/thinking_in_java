package package69;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


import static package69.Statistics.randomNum;

/**
 * @ClassName Practice23
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 14:14
 * @Version 1.0
 */

class Statistics {

    private static final Random random = new Random();

    public static Map<Integer, Integer> randomNum(int frequency) {
        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < frequency; i++) {
            var key = random.nextInt(20);
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        return map;
    }
}

public class Practice23 {

    public static int findBiggestKey(int frequency) {
        var map = randomNum(frequency);
        var keyToValueMax = 0;
        var valueMax = 0;
        var keySet = map.keySet();
        var it = keySet.iterator();
        while (it.hasNext()) {
            var key = it.next();
            var tempValue = map.get(key);
            if (tempValue > valueMax) {
                valueMax = tempValue;
                keyToValueMax = key;
            }
        }
        map.remove(keyToValueMax);
        var entrySet = map.entrySet();
        var itEn = entrySet.iterator();
        while (itEn.hasNext()) {
            var entry = itEn.next();
            var val = entry.getValue();
            if (val == valueMax) {
                return -1;
            }
        }
        return keyToValueMax;
    }

    public static void main(String[] args) {

        var map = new HashMap<Integer, Integer>();
        for (var i = 0; i < 2000; i++) {
            var keyMax = findBiggestKey(2000);
            map.put(keyMax, map.containsKey(keyMax) ? map.get(keyMax) + 1 : 1);
        }
        map.remove(-1);
        System.out.println(map);
    }
}

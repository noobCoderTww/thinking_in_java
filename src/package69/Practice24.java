package package69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @ClassName Practice24
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 15:36
 * @Version 1.0
 */

public class Practice24 {


    public static void main(String[] args) {
        var m1 = new HashMap<String, Integer>();
        m1.put("zero", 0);
        m1.put("one", 1);
        m1.put("two", 2);
        m1.put("three", 3);
        m1.put("four", 4);
        m1.put("five", 5);
        m1.put("six", 6);
        m1.put("seven", 7);
        m1.put("eight", 8);
        m1.put("nine", 9);
        m1.put("ten", 10);
        m1.put("eleven", 11);
        m1.put("twelve", 12);
        m1.put("thirteen", 13);
        m1.put("fourteen", 14);
        var keySet = m1.keySet();
        var list = new ArrayList(keySet);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        var it = list.listIterator();
        var lMap = new LinkedHashMap<String, Integer>();
        while (it.hasNext()) {
            var key = (String) it.next();
            lMap.put(key, m1.get(key));
        }
        System.out.println(lMap);
    }
}

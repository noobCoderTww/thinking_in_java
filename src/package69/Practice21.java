package package69;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static package69.FileInputStreamUtil.readFile;

/**
 * @ClassName Practice21
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 10:01
 * @Version 1.0
 */

public class Practice21 {


    public void countWords(String path) throws IOException {
        var sb = readFile(path);
        var arrS = sb.split("[^A-Za-z]");
        var map = new HashMap<String, Integer>();
        for (var str : arrS) {
            map.put(str, map.containsKey(str) ? map.get(str) + 1 : 1);
        }
        map.remove("");
        var ketSet = map.keySet();
        var list = new ArrayList<>(ketSet);
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        var it = list.iterator();
        var linkedHashMap = new LinkedHashMap<String, Integer>();
        while (it.hasNext()) {
            var key = it.next();
            linkedHashMap.put(key, map.get(key));
        }
        System.out.println(linkedHashMap);
    }


    private static class Inner {
        public static void main(String[] args) {
            try {
                new Practice21().countWords("D:\\workplace\\javawork\\jdk12test\\src\\package69\\Practice21.java");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

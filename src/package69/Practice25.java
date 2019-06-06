package package69;

import java.io.IOException;
import java.util.*;

import static package69.FileInputStreamUtil.readFile;
import static package69.FileOutputStreamUtil.writeFile;

/**
 * @ClassName Practice25
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 16:15
 * @Version 1.0
 */

public class Practice25 {
    public static Map<String, ArrayList<Integer>> record(String path) throws IOException {
        var sb = readFile(path);
        var arrStr = sb.split(" ");
        var setStr = new LinkedHashSet<String>();
        Collections.addAll(setStr, arrStr);
        System.out.println(setStr);
        var it = setStr.iterator();
        var map = new LinkedHashMap<Integer, String>();
        for (var i = 0; i < arrStr.length; i++) {
            map.put(i, arrStr[i]);
        }
        System.out.println(map);
        var lMap = new LinkedHashMap<String, ArrayList<Integer>>();
        while (it.hasNext()) {
            var str = it.next();
            var arrList = new ArrayList<Integer>();
            for (var i = 0; i < map.size(); i++) {
                if (map.get(i).equals(str)) {
                    arrList.add(i);
                }
            }
            lMap.put(str, arrList);
        }
        return lMap;
    }


    public static String[] output(Map<String, ArrayList<Integer>> linkedHashMap) {
        var values = linkedHashMap.values();
        var it = values.iterator();
        int len = 0;
        while (it.hasNext()) {
            var aList = it.next();
            len += aList.size();
        }
        var arrWord = new String[len];
        var entrySet = linkedHashMap.entrySet();
        var eIt = entrySet.iterator();
        while (eIt.hasNext()) {
            var entry = eIt.next();
            var word = entry.getKey();
            var arrayList = entry.getValue();
            var aIt = arrayList.iterator();
            while (aIt.hasNext()) {
                var index = aIt.next();
                arrWord[index] = word;
            }
        }
        return arrWord;
    }

    private static class Inner {
        public static void main(String[] args) {
            try {
                var lmap = record("D:\\test\\package11\\practice.txt");
                System.out.println(lmap);
                var arr = output(lmap);
                var sb = new StringBuilder();
                for (var i = 0; i < arr.length; i++) {
                    sb.append(arr[i]);
                    sb.append(" ");
                }
                writeFile("D:\\test\\package11\\practice1.txt", sb.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

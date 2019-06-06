package package69;

import java.io.IOException;
import java.util.Arrays;
import java.util.TreeMap;

import static package69.FileInputStreamUtil.readFile;

/**
 * @ClassName Practice20
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 9:20
 * @Version 1.0
 */

public class Practice20 {

    public void countVowel(String path) throws IOException {
        var sb = readFile(path);
        var arrStr = sb.toLowerCase().split("[^a-z]");
        var arrCa = Arrays.toString(arrStr).toCharArray();
        var map = new TreeMap<Character, Integer>();
        for (var i : arrCa) {
            map.put(i, map.containsKey(i) ? map.get(i) + 1 : 1);
        }
        var setMap = map.keySet();
        var it = setMap.iterator();
        while (it.hasNext()) {
            var key = it.next();
            if (key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                System.out.println(key + "=" + map.get(key));
            }
        }
    }

    private static class Inner {
        public static void main(String[] args) {
            try {
                new Practice20().countVowel("D:\\workplace\\javawork\\jdk12test\\src\\package69\\Queue.java");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

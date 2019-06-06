package package69;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import static package69.FileInputStreamUtil.readFile;

/**
 * @ClassName Practice16
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 21:45
 * @Version 1.0
 */

public class Practice16 {


    public void countVowel(String path) throws IOException {
        var sb = readFile(path);
        var set = new TreeSet<String>();
        var set1 = new TreeSet<String>();
        var arr = sb.toLowerCase().split("[^a-z]");
        Collections.addAll(set, arr);
        System.out.println(set);
        var it = set.iterator();
        while (it.hasNext()) {
            var word = it.next();
            var count_a = 0;
            var count_e = 0;
            var count_i = 0;
            var count_o = 0;
            var count_u = 0;
            var words = word.toCharArray();
            for (var index = 0; index < words.length; index++) {
                switch (words[index]) {
                    case 'a':
                        count_a++;
                        break;
                    case 'e':
                        count_e++;
                        break;
                    case 'i':
                        count_i++;
                        break;
                    case 'o':
                        count_o++;
                        break;
                    case 'u':
                        count_u++;
                        break;
                }
            }
            set1.add(word + "的a个数：" + count_a + ",e的个数：" + count_e + ",i的个数" + count_i + ",o的个数" + count_o + ",u的个数" + count_u);
        }
        var it1 = set1.iterator();

        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }

    private static class Inner1 {
        public static void main(String[] args) {
            var p16 = new Practice16();
            try {
                p16.countVowel("D:\\workplace\\javawork\\jdk12test\\src\\package69\\Practice15.java");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    private static class Inner2 {

        public static void main(String[] args) {
            var rand = new Random(47);
            var map = new TreeMap<Integer, Integer>();
            for (var i = 0; i < 1000; i++) {
                var r = rand.nextInt(20);
                var ret = map.get(r);
                map.put(r, ret == null ? 1 : ret + 1);
            }
            System.out.println(map);
        }
    }
}
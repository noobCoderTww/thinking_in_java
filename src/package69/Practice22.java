package package69;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static package69.FileInputStreamUtil.readFile;

/**
 * @ClassName Practice22
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 10:52
 * @Version 1.0
 */

class WordsCount {
    private String word;
    private int count = 0;

    public WordsCount(String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }


    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }


    public String toString() {
        return "word:" + word + ",count:" + count;
    }
}


public class Practice22 {

    public Set countWord(String path, Set<WordsCount> set) throws IOException {
        var sb = readFile(path);
        var arrStr = sb.split("[^A-Za-z]");
        var set1 = new HashSet<String>();
        Collections.addAll(set1, arrStr);
        set1.remove("");
        var it1 = set1.iterator();
        while (it1.hasNext()) {
            set.add(new WordsCount(it1.next()));
        }
        for (var str : arrStr) {
            for (var wc : set) {
                if (wc.getWord().equals(str)) {
                    wc.setCount(wc.getCount() + 1);
                }
            }
        }
        return set;
    }

    private static class Inner {
        public static void main(String[] args) {
            try {
                var set = new Practice22().countWord("D:\\workplace\\javawork\\jdk12test\\src\\package69\\Practice22.java", new HashSet<>());
                System.out.println(set);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

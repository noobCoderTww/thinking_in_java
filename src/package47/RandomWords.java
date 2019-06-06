package package47;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName RandomWords
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/22 10:55
 * @Version 1.0
 */

public class RandomWords implements Readable {

    private static Random random = new Random(47);

    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    private static final char[] vowels = "aeiou".toCharArray();

    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[random.nextInt(capitals.length)]);
        for (var i = 0; i < 4; i++) {
            cb.append(vowels[random.nextInt(vowels.length)]);
            cb.append(lowers[random.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        var sc = new Scanner(new RandomWords(1));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}

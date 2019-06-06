package package48;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

/**
 * @ClassName RandomDoubles
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/22 14:06
 * @Version 1.0
 */

public class RandomDoubles {
    private static final Random random = new Random(47);

    public Double next() {
        return random.nextDouble();
    }

    public static void main(String[] args) {
        var randomDoubles = new RandomDoubles();
        for (var i = 0; i < 7; i++) {
            System.out.println(randomDoubles.next());
        }
    }
}


class AdaptedRandomDoubles extends RandomDoubles implements Readable {

    private int count;


    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        var result = next() + " ";
        cb.append(result);
        return 10000;
    }

    public static void main(String[] args) {
        var sc = new Scanner(new AdaptedRandomDoubles(7));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}


class RetCharArray {
    private static final Random random = new Random();
    private static final String[] names = {
            "吴雕", "郭志伟", "郑宏杰", "刘耀", "杨龙"
    };


    private static final String[] predicates = {
            "是", "像", "等于"
    };

    private static final String[] characteristics = {
            "哈批", "睡神", "吹逼王", "冷场王", "敲床王"
    };

    private static int counter = 0;

    public void swap(String[] strs, int i, int j) {
        var temp = strs[i];
        strs[i] = strs[j];
        strs[j] = temp;
    }


    public String randomAndSwap(String[] strs) {
        var index1 = random.nextInt(strs.length - counter);
        var str = strs[index1];
        var index2 = strs.length - counter - 1;
        swap(strs, index1, index2);
        return str;
    }

    public String getStr() {
        var sb = new StringBuilder();
        sb.append(randomAndSwap(names));
        sb.append(predicates[random.nextInt(predicates.length)]);
        sb.append(randomAndSwap(characteristics));
        counter++;
        return sb.toString();
    }
}

class AdaptedRetCharArray extends RetCharArray implements Readable {

    private int count;

    public AdaptedRetCharArray(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        var str = getStr();
        cb.append(str);
        cb.append(" ");
        return 0;
    }

    public static void main(String[] args) {

        var sc = new Scanner(new AdaptedRetCharArray(5));
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
    }
}
package package67;

import java.util.*;

/**
 * @ClassName Gerbil
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/29 16:42
 * @Version 1.0
 */

public class Gerbil {

    int gerbilNumber;

    public Gerbil(int num) {
        this.gerbilNumber = num;
    }

    void hop() {
        System.out.println("编号为" + gerbilNumber + "的老鼠，正在跳");
    }

    public static void main(String[] args) {
        var gerbilList = new ArrayList<Gerbil>();

        for (var i = 0; i < 10; i++) {
            gerbilList.add(new Gerbil(i));
        }
        var iterator = gerbilList.iterator();
        while (iterator.hasNext()) {
            var gerbil = iterator.next();
            gerbil.hop();
        }
    }
}

class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new TreeSet<>();
        for (var i = 0; i < 10; i++) {
            c.add(i);
        }
        for (var i : c) {
            System.out.println(i);
        }
    }
}

class AddingGroups {
    public static void main(String[] args) {
        var collection = new ArrayList<>(Arrays.asList(121, 1231, 4564654, 12313, "大萨达撒"));
        Integer[] i1 = {
                1231, 1231, 1231
        };
        collection.addAll(Arrays.asList(i1));
    }
}
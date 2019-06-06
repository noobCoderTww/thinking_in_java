package package69;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MapOfList
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/6 21:06
 * @Version 1.0
 */


class People {

    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class MapOfList {

    private static Map<People, List<? extends Pet>> map;

    static {
        map = new HashMap<>();
        map.put(new People("老谭"), Arrays.asList(new Dog("fat dog"),
                new Cat("thin cat"), new Hamster("what ?")));
        map.put(new People("老李"), Arrays.asList(new Dog("no dog"),
                new Cat("no cat"), new Hamster("no hamster")));
    }

    private static class Inner {
        public static void main(String[] args) {
            System.out.println(map);
            System.out.println(map.values());
            System.out.println(map.keySet());
            var set = map.keySet();
            for (var key : set) {
                var value = map.get(key);
                System.out.println(key + ":" + value);
            }
            var it = set.iterator();
            while (it.hasNext()) {
                var key = it.next();
                var value = map.get(key);
                System.out.println(key + ":" + value);
            }
            //var it = set.listIterator();
            // listIterator是list集合独有的，应该是因为list是线性排列的所以可以从双端查找集合中的元素
        }
    }

}

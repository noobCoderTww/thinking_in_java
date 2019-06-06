package package69;

import java.util.*;

/**
 * @ClassName ArraysTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/1 10:48
 * @Version 1.0
 */

public class ArraysTest {

    public static void main(String[] args) {
        var list = Arrays.asList(1231, 123132); //虽然返回值是list 但是 仍然不能改变他的长度
        var list1 = new ArrayList<>(list);
        list1.add(111);
        list1.addAll(list);
        System.out.println(list1.size());
        Integer[] a = {
                1, 2, 3, 4
        };
        Collection c = new ArrayList();
        var list2 = new ArrayList<>(c); //  构造器中所传的参数只能为实现collection接口的对象
        c.add(10);
        Collections.addAll(c, "dasd", "dasdasd");  // 工具方法，里面可以为Collection的对象增加元素
        System.out.println(c.size());
        Arrays.<Integer>asList();// 有时候申明类型非常必要 ，因为 像是 两个继承于同一个子类的对象 要转成父类的集合时就会报错

    }
}

class PracticeContainer {
    private ArrayList<String> arrayList;

    private static final String[] initMovieName = {
            "流浪地球",
            "蜘蛛侠",
            "美国往事",
            "西西里的美丽传说",
            "一拳超人",
            "鬼灭之刃"
    };

    private int count;

    public PracticeContainer() {
        this.arrayList = new ArrayList<>(Arrays.asList(initMovieName));
    }

    public String next() {
        if (count == arrayList.size()) {
            count = 0;
        }
        return arrayList.get(count++);
    }

    public void add(String movieName) {
        arrayList.add(movieName);
    }


    public Collection fill(Collection<String> collection) {
        collection.addAll(arrayList);
        return collection;
    }

    public String[] fill(String[] movieNames) {
        for (var i = 0; i < movieNames.length; i++) {
            movieNames[i] = next();
        }
        return movieNames;
    }


    public static void main(String[] args) {
        var pContainer = new PracticeContainer();
        var strs = new String[10];
        var array = pContainer.fill(strs);
        for (var item : array) {
            System.out.println(item);
        }
        System.out.println("-----------------------");
        var arrayList = pContainer.fill(new ArrayList<>());
        System.out.println(arrayList);
        System.out.println("----------------------------");
        pContainer.add("风云三");
        var linkedList = pContainer.fill(new LinkedList<>());
        System.out.println(linkedList);
        System.out.println("-----------------------");
        var hashSet = pContainer.fill(new HashSet<>());
        System.out.println(hashSet);
        System.out.println("-----------------------");
        var treeSet = pContainer.fill(new TreeSet<>());
        System.out.println(treeSet);
        System.out.println("-----------------------");
        var linkedHashSet = pContainer.fill(new LinkedHashSet<>());
        System.out.println(linkedHashSet);
    }
}
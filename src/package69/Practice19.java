package package69;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @ClassName Practice19
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/7 9:12
 * @Version 1.0
 */

public class Practice19 {

    public static void main(String[] args) {
        var s1 = new HashSet<T>();
        Collections.addAll(s1, new T(10), new T(9), new T(12), new T(15));
        System.out.println(s1); //  hashSet的排列顺序只与hash值有关
        var s2 = new LinkedHashSet<T>();
        Collections.addAll(s2, new T(10), new T(9), new T(12), new T(15));
        System.out.println(s2); //只与添加顺序有关
    }
}

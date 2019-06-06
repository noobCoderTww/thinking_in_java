package package69;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @ClassName Pratice18
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/6 21:59
 * @Version 1.0
 */

class T {

    private int hash;

    public T(int hash) {
        this.hash = hash;
    }

    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public String toString() {
        return "该对象的hash值为：" + hash;
    }
}

public class Practice18 {


    public static void main(String[] args) {

        var map = new HashMap<T, String>();
        map.put(new T(3), "Z");
        map.put(new T(1), "x");
        map.put(new T(2), "y");
        System.out.println(map);  // hashMap的排列顺序只与KEY的hash值有关

        var map1 = new LinkedHashMap<T, String>();
        map1.put(new T(2), "Z");
        map1.put(new T(4), "g");
        map1.put(new T(0), "f");
        System.out.println(map1); //linkedHasp的排列顺序只与添加顺序有关
    }
}

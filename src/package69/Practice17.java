package package69;

import package67.Gerbil;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Practice17
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/6 21:41
 * @Version 1.0
 */

class NewGerbil {

    String name;

    public NewGerbil(String name) {
        this.name = name;
    }

    public void hop() {
        System.out.println("名字为:" + name + "的老鼠正在跳！");
    }

}


public class Practice17 {

    private static Map<String, NewGerbil> gerbilMap;

    static {
        gerbilMap = new HashMap<>();
        var g1 = new NewGerbil("老郑");
        var g2 = new NewGerbil("老李");
        var g3 = new NewGerbil("老外");
        gerbilMap.put(g1.name, g1);
        gerbilMap.put(g2.name, g2);
        gerbilMap.put(g3.name, g3);
        var keys = gerbilMap.keySet();
        var it = keys.iterator();
        while (it.hasNext()) {
            var key = it.next();
            System.out.print(key + "  ");
            gerbilMap.get(key).hop();
        }
    }

    public static void main(String[] args) {

    }
}

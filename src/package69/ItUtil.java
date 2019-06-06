package package69;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

/**
 * @ClassName ItUtil
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/4 11:40
 * @Version 1.0
 */

public class ItUtil {


    public static <T> void printIt(Collection<T> collection) {
        var it = collection.iterator();
        while (it.hasNext()) {
            var t = it.next();
            System.out.println(t.toString());
        }
    }

    public static void main(String[] args) {
        var p = new PracticeContainer();
        printIt(p.fill(new ArrayList<>()));
        printIt(p.fill(new LinkedList<>()));
    }
}

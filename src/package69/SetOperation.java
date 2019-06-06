package package69;

import java.util.Collections;
import java.util.HashSet;

/**
 * @ClassName SetOpreation
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 21:16
 * @Version 1.0
 */

public class SetOperation {

    private static class Inner1 {
        public static void main(String[] args) {
            var set1 = new HashSet<String>();
            Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
            System.out.println(set1.contains("H"));
            set1.remove("H");
            System.out.println(set1.contains("H"));
            var set2 = new HashSet<String>();
            Collections.addAll(set2, "I J K L".split(" "));
            System.out.println(set1.containsAll(set2));
            System.out.println(set1.removeAll(set2));
            set1.addAll(set2);
            System.out.println(set1);
            System.out.println(set1.remove("L")); //删除第一个L对象
            System.out.println(set1);
            System.out.println(set2);
        }
    }
}

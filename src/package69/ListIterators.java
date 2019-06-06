package package69;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ListIterators
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 10:26
 * @Version 1.0
 */

public class ListIterators {
    public static void main(String[] args) {
        var list1 = new ArrayList<Integer>();

        for (var i = 0; i < 10; i++) {
            list1.add(i);
        }

        var list2 = new ArrayList<Integer>();


        var l1 = new ListIterators();
        var s1 = l1.new SolveImp1();
        var m = s1.method(list1, list2);
        l1.printList(m);
        System.out.println("-----------------");
        var s2 = l1.new SolveImp2();
        var m1 = s2.method(list1, list2);
        l1.printList(m1);
        System.out.println("-----------------");
        var s3 = l1.new SolveImp3();
        var m2 = s3.method(list1, list2);
        l1.printList(m2);
        //System.out.println(list2);
    }

    //定义内部类1
    public class SolveImp1 implements Solve {
        @Override
        public Map method(ArrayList list1, ArrayList list2) {
            var integerListIterator = list1.listIterator(list1.size());
            while (integerListIterator.hasPrevious()) {
                list2.add(integerListIterator.previous());
            }
            var h = new HashMap<String, ArrayList>();
            h.put("list1", list1);
            h.put("list2", list2);
            return h;
        }
    }

    //定义内部类2
    public class SolveImp2 implements Solve {
        @Override
        public Map method(ArrayList list1, ArrayList list2) {

            for (var i = list1.size() - 1; i > -1; i--) {
                list2.add(list1.get(i));
            }

            var h = new HashMap<String, ArrayList>();
            h.put("list1", list1);
            h.put("list2", list2);
            return h;
        }

    }

    //定义内部类三
    public class SolveImp3 implements Solve {
        @Override
        public Map method(ArrayList list1, ArrayList list2) {
            Collections.reverse(list1);
            list2.addAll(list1);
            Collections.reverse(list1);

            var h = new HashMap<String, ArrayList>();
            h.put("list1", list1);
            h.put("list2", list2);
            return h;
        }
    }


    public void printList(Map m) {
        var list1_ = m.get("list1");
        var list2_ = (ArrayList) m.get("list2");
        System.out.println(list1_);
        System.out.println(list2_);
        list2_.removeAll(list2_);
    }

}

interface Solve {

    //定义接口
    Map method(ArrayList list1, ArrayList list2);
}
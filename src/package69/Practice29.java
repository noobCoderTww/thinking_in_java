package package69;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @ClassName Practice29
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 15:53
 * @Version 1.0
 */

class SimpleClass extends Object {
}

class SimpleClass2 {

}

public class Practice29 {

    public static void main(String[] args) {
        var priorityQueue = new PriorityQueue<>();
        /*  priorityQueue.offer(new SimpleClass());*/
        try {
            priorityQueue.offer(new SimpleClass());
            priorityQueue.offer(new SimpleClass2());
        } catch (Exception e) {
            System.out.println(123);
        }
        var collection = new AbstractCollection<>() {

            @Override
            public Iterator<Object> iterator() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }
        };
    }
}

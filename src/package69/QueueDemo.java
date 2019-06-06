package package69;

import java.util.*;
import java.util.Queue;

/**
 * @ClassName QueueDemo
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 10:35
 * @Version 1.0
 */

public class QueueDemo {


    private static final Random random = new Random(47);

    public static <T> void printQ(Queue<T> queue) {
        var fre = queue.size();
        for (var i = 0; i < fre; i++) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();
        for (var i = 0; i < 50; i++) {
            queue.offer(random.nextInt(20));
        }
        printQ(queue);
        System.out.println();
        Queue queue1 = new LinkedList<Character>();
        for (var i = 0; i < 50; i++) {
            queue1.offer((char) (random.nextInt(26) + 97));
        }
        printQ(queue1);
    }

    private static class Inner1 {
        public static void main(String[] args) {
            Queue queue = new LinkedList<>();
            try {
                queue.remove();
            } catch (Exception e) {
                if (e instanceof NoSuchElementException) {
                    System.out.println("当前容器中没有该元素");
                }
            }
            var i = queue.poll();
            System.out.println(i instanceof String);
            System.out.println(i);
        }


        public static Object get() {
            return null;
        }

    }
}

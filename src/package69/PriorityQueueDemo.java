package package69;

import java.util.*;

import static package69.QueueDemo.printQ;

/**
 * @ClassName PriorityQueue
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 14:43
 * @Version 1.0
 */

public class PriorityQueueDemo {
    private static class Inner1 {
        public static void main(String[] args) {
            var queue = new PriorityQueue<String>(); //优先队列
            String[] strs = {
                    "ae",
                    "aa",
                    "ab",
                    "ad",
                    "ac",
            };
            useQueue(queue, strs);
            Integer[] integers = {
                    10, 20, 3, 66, 88, 32, 14
            };
            var queue2 = new PriorityQueue<Integer>();
            useQueue(queue2, integers);
        }

        public static <T> void useQueue(PriorityQueue<T> queue, T[] ts) {
            Collections.addAll(queue, ts);
            while (queue.peek() != null) {
                System.out.println(queue.poll());
            }
        }

    }

    private static class Inner2 {
        public static void main(String[] args) {
            var list = Arrays.asList(11, 22, 33, 86, 96, 77, 65,
                    45, 87, 95, 64, 35, 85, 77);
            PriorityQueue priorityQueue = new PriorityQueue<>(list.size(), Collections.reverseOrder());
            priorityQueue.addAll(list);
            printQ(priorityQueue);
            var fact = "YOU ARE A BITCH";
            priorityQueue = new PriorityQueue<>(Arrays.asList(fact.split("")));
            printQ(priorityQueue);
            char[] arrCa = fact.toCharArray();
            var charHashSet = new HashSet<Character>();
            var charTreeSet = new TreeSet<Character>();
            for (var ca : arrCa) {
                charHashSet.add(ca);
                charTreeSet.add(ca);
            }
            priorityQueue = new PriorityQueue<>(charHashSet);
            printQ(priorityQueue);
            System.out.println(charTreeSet);
        }
    }
}

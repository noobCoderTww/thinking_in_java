package package69;

import java.util.LinkedList;

/**
 * @ClassName Queue
 * @Description LinkedList实现队列
 * @Author tanwenwei
 * @Date 2019/5/5 15:48
 * @Version 1.0
 */

public class Queue<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    public void lPush(T t) {
        linkedList.addFirst(t);
    }

    public T peek() {
        return linkedList.peekLast();
    }

    public T rPop() {
        return linkedList.pollLast();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    private static class Inner1 {
        public static void main(String[] args) {
            var queue = new Queue<String>();

            String[] ages = {
                    "18",
                    "19",
                    "20",
                    "21"
            };

            for (var age : ages) {
                queue.lPush(age);
            }

            while (!queue.isEmpty()) {
                System.out.println(queue.rPop());
            }
        }
    }
}

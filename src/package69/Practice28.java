package package69;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

import static package69.QueueDemo.printQ;

/**
 * @ClassName Practice28
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 15:46
 * @Version 1.0
 */

public class Practice28 {

    private static final Random random = new Random();

    public static void main(String[] args) {
        var queue = new PriorityQueue<>();
        for (var i = 0; i < 20; i++) {
            queue.offer(random.nextDouble());
        }
        while (queue.peek() != null) {
            System.out.print(queue.poll() + " ");
        }
    }
}

package package69;

import java.util.LinkedList;

/**
 * @ClassName Stack
 * @Description 用LinkedList实现的栈
 * @Author tanwenwei
 * @Date 2019/5/5 15:36
 * @Version 1.0
 */

public class Stack<T> {
    private LinkedList<T> linkedList = new LinkedList<>();

    public void push(T t) {
        linkedList.addFirst(t);
    }

    public T peek() {
        return linkedList.peek();
    }

    public T pop() {
        return linkedList.poll();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    private static class InnerClass {
        public static void main(String[] args) {
            var stack = new Stack<String>();
            String[] roomMate = {
                    "杨龙1",
                    "刘耀2",
                    "吴雕3",
                    "郭志伟4",
                    "郑宏杰5"
            };
            for (var mate : roomMate) {
                stack.push(mate);
            }
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }

            System.out.println();
            var stack1 = new java.util.Stack<String>(); //使用util的自带的栈
            for (var mate : roomMate) {
                stack1.push(mate);
            }
            while (!stack1.empty()) {
                System.out.print(stack1.pop() + " ");
            }
        }
    }
}

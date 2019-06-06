package package69;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @ClassName LinkedListTest
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/5 11:32
 * @Version 1.0
 */

public class LinkedListTest {


    public static void main(String[] args) {
        new LinkedListTest().getFirstTest();
    }

    public List getFirstTest() {
        var l1 = new LinkedList<Integer>();

        try {
            l1.element();  // 列表为空时会报错
        } catch (Exception e) {
            System.out.println(e instanceof NoSuchElementException);
        }

        try {
            l1.getFirst();  // 列表为空时会报错
        } catch (Exception e) {
            System.out.println(e instanceof NoSuchElementException);
        }

        System.out.println(l1.peek()); // 即使为空也不会报错

        for (var i = 0; i < 10; i++) {
            l1.add(i);
        }
        var e0 = l1.element();
        var e0_ = l1.getFirst();
        var e0__ = l1.peek();
        System.out.println(e0 + "  " + e0_ + "  " + e0__);
        System.out.println((e0 == e0_) && (e0 == e0__));
        return l1;
    }


    public void removeFirst() {
        var linkedList = new LinkedList<Integer>();

        try {
            linkedList.removeFirst(); //列表为空时 会抛错
        } catch (Exception e) {
            System.out.println(e instanceof NoSuchElementException);
        }
        try {
            linkedList.remove();  // 为空时会抛错
        } catch (Exception e) {
            System.out.println(e instanceof NoSuchElementException);
        }

        System.out.println(linkedList.poll()); // 即使为空也不会报错 只是返回null


        for (var i = 0; i < 10; i++) {
            linkedList.add(i);
        }


        var a = linkedList.remove(); //删除第一个元素
        System.out.println(a);
        var b = linkedList.removeFirst(); // 删除第一个元素
        System.out.println(b);
        var c = linkedList.poll(); //删除第一个元素
        System.out.println(c);
    }

    public void add() {
        var l1 = new LinkedList<Integer>();
        for (var i = 0; i < 10; i++) {
            l1.add(i);
        }
        l1.add(10); //插入尾部
        System.out.println(l1);
        l1.addFirst(11); //插入头部
        System.out.println(l1);
        l1.addLast(12); //插入尾部
        System.out.println(l1);
    }

    public static class Inner2 {
        public static void main(String[] args) {
            var l1 = new LinkedListTest();
            l1.add();
        }
    }

    public static class Inner1 {
        public static void main(String[] args) {
            var l1 = new LinkedListTest();
            l1.removeFirst();
        }
    }

    public static class Inner3 {
        public static void main(String[] args) {
            var l1 = new LinkedList<Integer>();

            try {
                l1.removeLast(); //没有元素时会报错
            } catch (Exception e) {
                System.out.println(e instanceof NoSuchElementException);
            }
            l1.add(1);
            l1.add(2);
            l1.add(3);
            l1.removeLast();
            System.out.println(l1);
        }
    }
}

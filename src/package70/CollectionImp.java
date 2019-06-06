package package70;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @ClassName CollectionImp
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/9 15:00
 * @Version 1.0
 */


class Node<T> {
    private T t;

    private Node<T> next;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


public class CollectionImp<T> implements Collection<T> {


    private Node<T> firstNode;
    private int size = 0;


    @Override
    public boolean add(T t) {

        if (size == 0) {
            firstNode = new Node<>();
            firstNode.setT(t);
        } else {
            var temp1 = firstNode;
            for (var i = 0; i < size - 1; i++) {
                temp1 = temp1.getNext();
            }
            temp1.setNext(new Node<>());
            temp1.getNext().setT(t);
        }
        size++;
        return true;
    }

    public T get(int index) {

        if (index >= size) {
            throw new NoSuchElementException();
        }
        Node temp = firstNode;
        for (var i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return (T) temp.getT();
    }


    @Override
    public boolean remove(Object o) {
        getNodeBeforeIndex(o);
        return false;
    }

    private static class Inner1 {
        public static void main(String[] args) {
            var c = new CollectionImp<Integer>();
            for (var i = 0; i < 10; i++) {
                c.add(i);
            }
            System.out.println(c.size());
            System.out.println(c.getNodeBeforeIndex(9));
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return getNodeBeforeIndex(o) != null ? true : false;
    }

    private Node<T> getNodeBeforeIndex(Object o) {
        Node<T> temp = firstNode;
        for (var i = 0; i < size; i++) {
            Node<T> t1 = temp;
            if (i > 0) {
                temp = temp.getNext();
            }
            var t = temp.getT();
            if (t == o) {
                return t1;
            }
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}


@FunctionalInterface
//检测该接口是否为函数式接口
interface A {

    void a();

}









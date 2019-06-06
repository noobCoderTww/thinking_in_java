package package70;

import java.util.*;

import static package70.InterfaceVsIterator.display;

/**
 * @ClassName InterfaceVsIterator
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/5/8 17:03
 * @Version 1.0
 */

public class InterfaceVsIterator {

    public static <T> void display(Collection<T> collection) {
        for (var t : collection) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    public static <T> void display(Iterator<T> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

class CollectionExAbstractCollection<T> extends AbstractCollection<T> {

    private T[] ts;
    private int ele = 0;
    private int arrSize;

    public CollectionExAbstractCollection() {
        ts = (T[]) new Object[6];
        arrSize = ts.length;
    }

    public CollectionExAbstractCollection(int initContainerSize) {
        ts = (T[]) new Object[initContainerSize];
        arrSize = ts.length;
    }

    @Override
    public boolean add(T t) {
        if (ele == arrSize) {
            var temp = (T[]) new Object[arrSize * 2];
            for (var i = 0; i < ts.length; i++) {
                temp[i] = ts[i];
            }
            ts = temp;
            arrSize = ts.length;
        }
        ts[ele] = t;
        ele++;
        return true;
    }

    public T get(int index) {
        if (index >= ele) {
            throw new NoSuchElementException();
        }
        return ts[index];
    }

    public T remove(int index) {
        if (index >= ele) {
            throw new NoSuchElementException();
        }
        var t = ts[index];
        for (var i = index; i < ele; i++) {
            ts[i] = ts[i + 1];
        }
        ele--;
        return t;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<T>() {
            private int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < ele;
            }

            @Override
            public T next() {
                if (pointer == ele) {
                    throw new NoSuchElementException();
                }
                return ts[pointer++];
            }

            @Override
            public void remove() {
                System.out.println("小伙子,我是个没有用的方法");
            }
        };
    }

    @Override
    public int size() {
        return ele;
    }

    private static class InnerTest {
        public static void main(String[] args) {
            var c = new CollectionExAbstractCollection<Integer>(80);
            for (var i = 0; i < 10; i++) {
                c.add(i);
            }
            display(c);
            c.remove(0);
            display(c.iterator());
        }
    }

}

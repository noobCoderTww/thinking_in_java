package package55;

/**
 * @ClassName Sequence
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/23 21:28
 * @Version 1.0
 */

interface Selector {
    boolean end();

    Object current();

    void next();

    Sequence getSeq();
}


public class Sequence {

    private Object[] items;

    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {

            if (i < items.length) {
                i++;
            }
        }

        @Override
        public Sequence getSeq() {
            return Sequence.this;
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }


    public static void main(String[] args) {
        var sequence = new Sequence(10);


        int a = (int) 'a';
        for (var i = 0; i < 10; i++) {
            sequence.add(new HasString("ab" + ((char) (a + i))));
        }
        var selector = sequence.getSelector();

        System.out.println(sequence == selector.getSeq());
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }

}

class HasString {
    private String str;

    HasString(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }

}


class Test {
    public static void main(String[] args) {
        var seq = new Sequence(10);
        seq.add(1);
        Selector selector = seq.getSelector();
        System.out.println(selector.current());
        var objs = new Object[10];
        objs[0] = 1;
    }
}


interface InnerInterface {
    void method();
}

class Outer {
    private class Inner implements InnerInterface {
        @Override
        public void method() {

        }
    }

    InnerInterface getInner() {
        return new Inner();
    }
}

class TestOutAndInner {
    public static void main(String[] args) {
        var outer = new Outer();
        var inner = outer.getInner();
        inner.method();
    }
}


class NewOuter {
    private String name;

    NewOuter(String name) {
        this.name = name;
    }

    class NewInner {
        public String toString() {
            return name;
        }
    }
}

class UseThis {
    public static void main(String[] args) {
        var o1 = new NewOuter("laotan");
        var i1 = o1.new NewInner();
        System.out.println(i1);
    }
}
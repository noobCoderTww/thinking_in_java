package package66;

/**
 * @ClassName Sequence
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 11:13
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

    public boolean add(Object obj) {
        if (next < items.length) {
            items[next] = obj;
            next++;
            return true;
        }
        return false;
    }


    public Selector reverseSelector() {
        return new Selector() {
            private int i = next - 1;

            @Override
            public boolean end() {
                return i  !=  -1;
            }

            @Override
            public Object current() {
                return Sequence.this.items[i];
            }

            @Override
            public void next() {
                if (i > -1) {
                    i--;
                }
            }

            @Override
            public Sequence getSeq() {
                return Sequence.this;
            }
        };
    }

    public static void main(String[] args) {

        var s = new Sequence(10);
        Object[] objs = {
                "测试1",
                "测试2",
                3,
                4,
                5,
                6,
                9,
                "k"
        };
        for (var i = 0; i < objs.length; i++) {
            s.add(objs[i]);
        }
        var sele = s.reverseSelector();
        while (sele.end()) {
            System.out.println(sele.current());
            sele.next();
        }

    }
}

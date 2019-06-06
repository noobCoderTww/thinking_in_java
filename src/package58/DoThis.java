package package58;

/**
 * @ClassName DoThis
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/24 10:57
 * @Version 1.0
 */

public class DoThis {
    private int count = 10;

    void f() {
        System.out.println("DoThis.f()");
        count--;
        if (count != 0) {
            DoThis.this.f();
        }
    }

    public class Inner {
        public DoThis outer() {
            return DoThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        var dt = new DoThis();
        var inner = dt.inner();
        inner.outer().f();
    }
}

class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            this.label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        var p = new Parcel3();
        var c = p.new Contents();
        var d = p.new Destination("label");

    }
}

class TwoOuter {
    static class StaticTwoInner {

    }

    class RegularTwoInner {

    }


}

interface Imp {

}

class UseOutersInner {
    public static void main(String[] args) {
        var sti = new TwoOuter.StaticTwoInner();
        var to = new TwoOuter();
        var rti = to.new RegularTwoInner();
    }
}

interface Destination {
    String readLabel();
}

interface Contents {
    int value();
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;


        public PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }

    }

    Destination getPDestination(String s) {
        return new PDestination(s);
    }

    Contents getPContents() {
        return new PContents();
    }
}


class TestParcle {

    public static void main(String[] args) {
        var p = new Parcel4();
        var c = p.getPContents();
        var d = p.getPDestination("深圳");
        d.readLabel();
    }
}














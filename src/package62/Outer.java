package package62;

/**
 * @ClassName Outer
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/25 10:00
 * @Version 1.0
 */

public class Outer {

    private String name;

    private void method() {
        System.out.println(name);
    }

    Outer(String name) {
        this.name = name;
        System.out.println(new Inner().innerName);
    }

    class Inner {

        private String innerName;

        void method1() {
            name = "guawazi";
            method();
        }
    }

    public void useInner() {
        new Inner().method1();
    }

    public static void main(String[] args) {
        var outer = new Outer("hapi");
        outer.useInner();
    }
}

interface Destination {
    String readLabel();
}

class Parcel5 {


    public Destination destination(String s) {

        class PDestination implements Destination {

            private String label;

            private PDestination(String whereTo) {

                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }


        return new PDestination(s);
    }

    public static void main(String[] args) {
        var parcel5 = new Parcel5();
        var destination = parcel5.destination("硅谷");
        System.out.println(destination.readLabel());
    }
}

interface A {

}


interface B extends A {

}


interface C extends B {

}

class T {
    public static void main(String[] args) {
        A c = new C() {

        };
    }
}

class Parcel6 {

    class In {
        private int i = 10;
    }


    private void internalTracking(boolean b) {
        if (b) {
            class TrackingSlip {
                private String id;

                TrackingSlip(String s) {
                    id = s;
                }

                String getSlip() {
                    return id;
                }
            }

            var t1 = new TrackingSlip("1");
            System.out.println(t1.id);
        }
        //var t2 = new TrackingSlip(); 超出作用域
    }

    public void track() {
        internalTracking(true);
    }

    public static void main(String[] args) {
        var p = new Parcel6();
        p.track();
        var in = p.new In();
        System.out.println(in.i);
    }
}

class Tr {
    public static void main(String[] args) {
        var p = new Parcel6();
    }
}

interface InnerInt {
    String name();
}

class Practice1 {

    public InnerInt createInnerIntImp() {
        class InnerIntImp implements InnerInt {
            @Override
            public String name() {
                return getClass().getSimpleName();
            }
        }
        return new InnerIntImp();
    }

    public static void main(String[] args) {
        var p1 = new Practice1();
        var i1 = p1.createInnerIntImp();
        System.out.println(i1.name());
    }
}

class Practice2 {
    public InnerInt createInnerIntImp2() {

        if (true) {
            class InnerIntImp2 implements InnerInt {
                @Override
                public String name() {
                    return getClass().getSimpleName();
                }
            }

            return new InnerIntImp2();
        }
        return null;
    }

    public static void main(String[] args) {
        var p2 = new Practice2();
        var i2 = p2.createInnerIntImp2();
        System.out.println(i2.name());
    }
}

class Practice3 {

    private class InnerIntImp3 implements InnerInt {
        @Override
        public String name() {
            return getClass().getSimpleName();
        }
    }

    public InnerInt createInnerInt3() {
        return new InnerIntImp3();
    }

}

class TestPractice3 {
    public static void main(String[] args) {
        var p3 = new Practice3();
        //InnerInt i3 = (InnerIntImp3) p3.createInnerInt3(); 不能向下转型，因为该类对其它类是完全隐藏的。


    }
}


interface Contents {
    int value();
}

class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 10;

            @Override
            public int value() {
                return i;
            }
        };
    }

    class ContentsImp implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }


    public Contents contents2() {
        return new ContentsImp();
    }

    public static void main(String[] args) {
        var p = new Parcel7();
        var c = p.contents();
        var c1 = p.contents2();
        System.out.println(c1.value());

    }
}

abstract class Base {
    private int i = 0;

    public Base(int i) {
        this.i = i;
        m2();
    }

    abstract void m1();

    void m2() {
        System.out.println("m2()");
    }
}


class BaseTwo extends Base {

    public BaseTwo(int i) {
        super(i);
        m1();
    }

    @Override
    public void m1() {
        System.out.println("m1() + \"\"");
    }
}

class Parcel0 {
    public Base base() {
        return new Base(1) {
            @Override
            public void m1() {
                System.out.println("m1()");
            }
        };
    }

    public Base base2() {
        return new BaseTwo(10) {

        };
    }

    public static void main(String[] args) {
        var p = new Parcel0();
        p.base();
        p.base2();
    }
}
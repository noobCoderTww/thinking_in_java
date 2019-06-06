package package65;

/**
 * @ClassName OuterT
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 10:41
 * @Version 1.0
 */

public class OuterT {
    private void m1() {
        System.out.println("OuterT.m1()");
    }

    static class InIn {
        public void m() {
        }
    }

    class Inner1 {
        private void m2() {
            System.out.println("OuterT.Inner1.m2()");
        }

        class Inner2 {
            public void useOuterMe() {
                m1();
                m2();
            }
        }
    }
}

class T2 {
    public static void main(String[] args) {
        var o = new OuterT();
        var i1 = o.new Inner1();
        var i2 = i1.new Inner2();
        i2.useOuterMe();
    }
}

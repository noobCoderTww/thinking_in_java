package package50;

/**
 * @ClassName NestingInterfaces
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/22 17:22
 * @Version 1.0
 */
class A {
    interface B {
        void f();
    }

    public class BImp implements B {
        @Override
        public void f() {

        }
    }

    public class BImp2 implements B {
        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    class CImp implements C {
        @Override
        public void f() {

        }
    }

    class CImp2 implements C {
        @Override
        public void f() {

        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {
        @Override
        public void f() {

        }
    }

    public class DImp2 implements D {
        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        this.dRef = d;
        dRef.f();
    }
}


interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();


    static void m() {

    }
}

public class NestingInterfaces {


    public class BImp implements A.B {
        @Override
        public void f() {

        }
    }

    class CImp implements A.C {
        @Override
        public void f() {

        }
    }

    class EImp implements E {

        @Override
        public void g() {

        }

    }

    class EGImp implements E.G {
        @Override
        public void f() {

        }

        class EImp2 implements E {
            @Override
            public void g() {

            }

            class EG implements E.G {
                @Override
                public void f() {

                }
            }

        }

    }

    public static void main(String[] args) {
        var a = new A();
        //A.D d = a.getD();
        //A.DImp2 d = a.getD();
        //a.getD().f();
        var a2 = new A();
        a2.receiveD(a.getD());

    }
}

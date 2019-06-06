package package45;

public interface Interface1 {

    void m();
}

interface Interface2 extends Interface1 {

    void m1();

    int m2();
}

interface Interface3 extends Interface1 {

    void m1();


}

interface Interface4 extends Interface2, Interface3 {

}


interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D extends A, B, C {
    void d();
}

abstract class Abc {
    abstract void a();

    abstract void b();

    abstract void c();
}

class Imp extends Abc {
    @Override
    void a() {

    }

    @Override
    void b() {

    }

    @Override
    void c() {

    }

    void d() {

    }
}

@FunctionalInterface
interface NoImp {
    int m1();

}


class UseNoImp {
    public void method(NoImp n1) {
        n1.m1();
    }

    public static void main(String[] args) {
        var useImp = new UseNoImp();
        useImp.method(() -> {
            System.out.println(123);
            return 1;
        });
    }
}

interface NoImp2 {
    int m2();

    int m3();
}

class UseNoImp2 {
    void method(NoImp2 n2) {
        n2.m2();
    }

    public static void main(String[] args) {
        var u2 = new UseNoImp2();
        u2.method(new NoImp2() {
            @Override
            public int m2() {
                return 0;
            }

            @Override
            public int m3() {
                return 0;
            }
        });
    }
}
































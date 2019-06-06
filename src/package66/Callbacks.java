package package66;

/**
 * @ClassName Callbacks
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/28 15:34
 * @Version 1.0
 */

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {

    private int i = 0;


    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {

    public void increment() {
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}

class Callee2 extends MyIncrement {

    private int i = 0;


    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Incrementable getCallBackReference() {
        return new Closure();
    }
}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}


public class Callbacks {

    public static void main(String[] args) {
        var c1 = new Callee1();
        var c2 = new Callee2();
        MyIncrement.f(c2);

        var caller1 = new Caller(c1);
        var caller2 = new Caller(c2.getCallBackReference());

        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();
    }
}

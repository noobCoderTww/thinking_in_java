package package66;

/**
 * @ClassName InheritInner
 * @Description TODO
 * @Author tanwenwei
 * @Date 2019/4/30 16:55
 * @Version 1.0
 */

class WithInner {
    class Inner {

    }
}

public class InheritInner extends WithInner.Inner {
    public InheritInner(WithInner withInner) {
        withInner.super();
    }
}

class WithInner2 {
    class Inner {
        public Inner(int i) {

        }
    }
}

class InheritInner2 extends WithInner2.Inner {
    public InheritInner2(WithInner2 withInner2) {
        withInner2.super(1);
    }
}

class Egg {
    private Yolk y;

    public Egg() {
        System.out.println("new Egg()");
        y = new Yolk();
    }

    public class Yolk {
        public Yolk() {
            System.out.println("Egg.yolk");
        }
    }
}

class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk");
        }
    }

    public static void main(String[] args) {
        var egg = new Egg();
        var bigEgg = new BigEgg();
    }
}


class Egg2 {

    private Yolk y = new Yolk();

    public Egg2() {
        System.out.println(" new egg2()");
    }

    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}

class BigEgg2 extends Egg2 {


    public BigEgg2() {
        insertYolk(new Yolk());
    }

    class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.BigEgg2Yolk()");
        }

        @Override
        public void f() {
            System.out.println("BigEgg2.BigEgg2Yolk.f()");
        }
    }

    public static void main(String[] args) {
        var bigEgg2 = new BigEgg2();
        bigEgg2.g();
    }
}














